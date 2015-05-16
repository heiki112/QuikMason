<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="qm"%>
<!DOCTYPE html>
<html ng-app="app">

<qm:head />

<body class="preview" id="top">

    <qm:menu_landing />

    <div id="content" class="container">
        <jsp:doBody />
    </div>

    <footer class="bs-docs-footer">
        <div class="container">
            <p class="pull-right">
                <a href="#top">Back to top2</a>
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
