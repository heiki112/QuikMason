<%@ include file="init.jsp"%>
<html ng-app="app">

<qm:pageTemplate>

<body style="padding-left:5%">
  <qm:header>
    <h1>Current offers</h1>
  </qm:header>

<div ng-controller="OfferController">
    <div class="row">
      <div class="col-sm-12">
        <!-- Grid is placed here by angular.js -->
        <div class="gridStyle" ng-grid="gridOptions"></div>
      </div>
    </div>
    
    </qm:pageTemplate>