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
        <a href="/main" class="navbar-brand">QuikMason</a>
      </div>

      <div class="collapse navbar-collapse" id="main-menu">
        <ul class="nav navbar-nav" id="main-menu-left">
          <li><a href="/main">Main</a></li>
          <li><a href="/user">My page</a></li>
          <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Offers <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="/viewoffers">Browse offers</a></li>
            <li><a href="/postoffer">Post new offer</a></li>
            <li><a href="#">My profile</a></li>
          </ul>
        </li>
        </ul>

        <ul class="nav navbar-nav navbar-right" id="user-actions">
          <s:eval expression="T(com.quikmason.user.UserUtil).getCurrentUser().getFirstName()" var="firstName" />
          <li><a href="#" style="text-transform: none; font-size: 12px;">(${firstName})</a></li>
          <li><a href="/logout" style="text-transform: none;">Log out </a></li>
        </ul>
      </div>
    </div>
  </div>

</jsp:root>