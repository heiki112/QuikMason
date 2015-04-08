<%@ include file="init.jsp"%>
<html ng-app="app">

<head>
    <meta charset="utf-8">
    <title>QuikMason</title>

    <c:url var="baseUrl" value="" />

    <!-- jQuery -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

    <!-- Angular -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.14/angular.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.14/angular-sanitize.js"></script>

    <!-- NG-Grid -->
    <link href="//cdnjs.cloudflare.com/ajax/libs/ng-grid/2.0.11/ng-grid.min.css" rel="stylesheet">
    <script src="//cdnjs.cloudflare.com/ajax/libs/ng-grid/2.0.11/ng-grid.min.js"></script>

    <!-- Select2 -->
    <link href="//cdnjs.cloudflare.com/ajax/libs/angular-ui-select/0.11.1/select.min.css" rel="stylesheet">
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-select/0.11.1/select.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/select2/3.5.2/select2.min.js"></script>

    <!-- Angular Strap -->
    <link rel="stylesheet" href="//rawgithub.com/mgcrea/bootstrap-additions/v0.2.3/dist/bootstrap-additions.min.css">
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular-strap/2.1.6/angular-strap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular-strap/2.1.6/angular-strap.tpl.min.js"></script>

    <!-- Charts -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/Chart.js/1.0.2/Chart.min.js"></script>

    <!-- Custom -->
    <link href="${baseUrl}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${baseUrl}/css/custom.css" rel="stylesheet">
    <script src="${baseUrl}/js/custom.js"></script>

</head>

<body style="padding-left:5%">
  <qm:header>
    <h1>Sign up</h1>
  </qm:header>

  <div ng-controller="UserController">

    <div class="col-sm-3">
      <form name="form" class="css-form" novalidate>
        <div class="form-group">
          <label for="username">Username:</label>
          <input type="text" class="form-control" id="username" ng-model="user.username" required />
        </div>
        <div class="form-group">
          <label for="password">Password:</label>
          <input type="text" class="form-control" id="password" ng-model="user.password" required />
        </div>
        <div class="form-group">
          <label for="first_name">First name:</label>
          <input type="text" class="form-control" id=first_name ng-model="user.first_name" required />
        </div>
        <div class="form-group">
          <label for="last_name">Last name:</label>
          <input type="text" class="form-control" id="last_name" ng-model="user.last_name" required />
        </div>
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="text" class="form-control" id="email" ng-model="user.email" required />
        </div>

        <button ng-click="save(user)" class="btn btn-primary">Save</button>
        <button ng-click="clear()" class="btn btn-danger">Clear</button>
        
        <a href="landing" class="btn btn-primary">Back</a>
      </form>
    </div>
  </div>
</body>
</html>