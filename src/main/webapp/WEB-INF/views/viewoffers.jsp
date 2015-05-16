<%@ include file="init.jsp"%>
<html ng-app="app">

<qm:template_session>

<body style="padding-left:5%">
  <qm:header>
    <h1>Current offers</h1>
  </qm:header>

<div ng-controller="OfferController">
    <div class="row">
      <div class="col-sm-12">
        <!-- Grid is placed here by angular.js -->
        <div class="gridStyle" ng-grid="gridOptions"></div>
          <div>
            <label for="company_name">Company Name:</label>
           <div class="selectedItems">{{mySelections[0].companyName}} </div>
          </div>
          <div>
            <label for="phone_nr">Phone number:</label>
           <div class="selectedItems">{{mySelections[0].phonenr}} </div>
          </div>
          <div>
            <label for="email">Email:</label>
           <div class="selectedItems">{{mySelections[0].email}} </div>
          </div>
          <div>
            <label for="address">Address:</label>
           <div class="selectedItems">{{mySelections[0].address}} </div>
          </div>
          <div>
            <label for="offer_name">Offer Name:</label>
           <div class="selectedItems">{{mySelections[0].offerName}} </div>
          </div>
          <div>
            <label for="content">Description:</label>
           <div class="selectedItems">{{mySelections[0].content}} </div>
          </div>
      </div>
    </div>
    
    </qm:template_session>