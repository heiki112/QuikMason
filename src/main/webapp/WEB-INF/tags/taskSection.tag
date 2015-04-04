<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:nrtl="/WEB-INF/tags" version="2.0">


  <jsp:directive.attribute name="sectionId" required="true" />
  <jsp:directive.attribute name="heading" required="true" />

  <section id="${sectionId}" class="sectionWithMenuItem" style="padding-bottom: 40px;">
    <div class="page-header">
      <h3 class="taskHeading">${heading}</h3>
    </div>
    <div class="row">
      <div class="span8">
        <jsp:doBody />
      </div>
    </div>
  </section>

</jsp:root>