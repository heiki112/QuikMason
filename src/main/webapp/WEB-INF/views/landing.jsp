<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>QuikMason</title>

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
    <div class="col-md-12">
        <iframe width="560" height="315" src="https://www.youtube.com/embed/y6120QOlsfU" frameborder="0" allowfullscreen></iframe>
    </div>
    <a href="login">Login</a>
    
    
    
    
    <H1>
        <spring:message code="label.form.title"></spring:message>
    </H1>
    <form:form modelAttribute="user" method="POST" enctype="utf8">
        <br>
        <tr>
       <td><label><spring:message code="label.user.firstName"></spring:message>
            </label>
        </td>
       <td><form:input path="firstName" value="" /></td>
       <form:errors path="firstName" element="div"/>
   </tr>
   <tr>
       <td><label><spring:message code="label.user.lastName"></spring:message>
            </label>
        </td>
       <td><form:input path="lastName" value="" /></td>
       <form:errors path="lastName" element="div" />
   </tr>
   <tr>
       <td><label><spring:message code="label.user.email"></spring:message>
            </label>
        </td>
       <td><form:input path="email" value="" /></td>
       <form:errors path="email" element="div" />
   </tr>
   <tr>
       <td><label><spring:message code="label.user.password"></spring:message>
            </label>
        </td>
       <td><form:input path="password" value="" type="password" /></td>
       <form:errors path="password" element="div" />
   </tr>
   <tr>
       <td><label><spring:message code="label.user.confirmPass"></spring:message>
            </label>
        </td>
       <td><form:input path="matchingPassword" value="" type="password" /></td>
       <form:errors element="div" />
   </tr>
        <button type="submit"><spring:message code="label.form.submit"></spring:message>
        </button>
    </form:form>
    <br>
    <a href="<c:url value="login.html" />">
        <spring:message code="label.form.loginLink"></spring:message>
    </a>
    
    
    
    
  </div>
</body>
</html>