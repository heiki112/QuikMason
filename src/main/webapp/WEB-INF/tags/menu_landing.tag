<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:s="http://www.springframework.org/tags"
  xmlns:qm="/WEB-INF/tags" version="2.0">

  <!-- Navbar
  ================================================== -->
  <div class="navbar navbar-inverse navbar-static-top">
    <div class="container">
      <div class="navbar-header">
        <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#main-menu">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"><jsp:text /></span>
          <span class="icon-bar"><jsp:text /></span>
          <span class="icon-bar"><jsp:text /></span>
        </button>
        <a href="/landing" class="navbar-brand">QuikTract</a>
      </div>

        <ul class="nav navbar-nav navbar-right" id="user-actions">
          <li><a href="/howitworks">Kuidas see töötab?</a></li>
          <li><a href="/user/registration">Registreeri</a></li>
          <li><a href="/login">Logi sisse</a></li>
          <li><a href="/worker_signup">Otsid tööd?</a></li>
        </ul>
    </div>
  </div>

</jsp:root>