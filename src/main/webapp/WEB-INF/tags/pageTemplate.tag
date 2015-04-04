<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="nrtl"%>
<!DOCTYPE html>
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
<body class="preview" id="top">

    <nrtl:menu />

    <div id="content" class="container">
        <jsp:doBody />
    </div>

    <footer class="bs-docs-footer">
        <div class="container">
            <p class="pull-right">
                <a href="#top">Back to top</a>
            </p>
        </div>
    </footer>

    <!-- Placed at the end of the document so the pages load faster -->

    <script type="text/javascript">
        $(function() {
            if ($('#submenu').length > 0) {
                Submenu.populateSubmenu('submenu', 'templateMenuItem', 'sectionWithMenuItem');
            }
        });
    </script>
</body>
</html>
