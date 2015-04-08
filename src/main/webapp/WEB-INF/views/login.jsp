<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Log in</title>

  <!-- jQuery -->
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

  <!-- Bootstrap -->
  <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

  <!-- Custom -->
  <link href="${baseUrl}/css/font-awesome.min.css" rel="stylesheet">
  <link href="${baseUrl}/css/custom.css" rel="stylesheet">
</head>
<body class="page-login">
  <div class="container">
    <form action="j_spring_security_check" class="form-signin text-center" method="post">
      <h2 class="form-signin-heading">Sign in</h2>
      <c:if test="${not empty param.error}">
        <p class="alert alert-danger">Login failed</p>
      </c:if>
      <label for="j_username" class="sr-only">Username</label>
      <input type="text" id="j_username" name="j_username" class="form-control" placeholder="Username" required autofocus>
      <label for="j_password" class="sr-only">Password</label>
      <input type="password" id="j_password" name="j_password" class="form-control" placeholder="Password" required>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
    <div>
    	<a href="signup">Sign Up #TODO</a>
    </div>
  </div>
</body>
</html>