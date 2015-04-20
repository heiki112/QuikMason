<%@ include file="init.jsp"%>
<html ng-app="app">

  <qm:pageTemplate>
  <div ng-controller="OfferController">    
        <div class="col-sm-4">
         <form name="form" class="css-form" novalidate>
          <div class="form-group">
            <label for="start_date">Start Date:</label>
            <div class="input-group">
              <input id="start_date" class="form-control" type="text" ng-model="offer.startDate" data-date-format="dd.MM.yyyy" data-date-type="string" bs-datepicker>
              <div class="input-group-addon"><i class="icon-calendar"></i></div>
            </div>
          </div>
          <div class="form-group">
            <label for="end_date">End Date:</label>
            <div class="input-group">
              <input id="end_date" class="form-control" type="text" ng-model="offer.endDate" data-date-format="dd.MM.yyyy" data-date-type="string" bs-datepicker>
              <div class="input-group-addon"><i class="icon-calendar"></i></div>
            </div>
          </div>
           <div class="form-group">
            <label for="company_name">Company Name:</label>
            <input type="text" id="company_name" class="form-control" ng-model="offer.companyName" required ng-maxlength="50" >
          </div>
          <div class="form-group">
            <label for="phone_nr">Phone Number:</label>
            <input type="text" id="phone_nr" class="form-control" ng-model="offer.phonenr" required ng-maxlength="50" >
          </div>
          <div class="form-group">
            <label for="mail">Mail:</label>
            <input type="email" id="mail" class="form-control" ng-model="offer.mail" required ng-maxlength="50" >
          </div>
           <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" id="address" class="form-control" ng-model="offer.address" required ng-maxlength="50" >
          </div>
          <div class="form-group">
            <label for="offer_name">Offer Label:</label>
            <input type="text" id="offer_name" class="form-control" ng-model="offer.offerName" required ng-maxlength="50" >
          </div>
          <div class="form-group">
            <label for="wage">Wage:</label>
            <input type="text" id="wage" class="form-control" ng-model="offer.wage" required ng-maxlength="50" >
          </div>
        <div class="col-sm-4">
          <div class="form-group">
            <label for="content">Content:</label>
            <textarea id="content" class="form-control" ng-model="offer.content" required ng-maxlength="2000" style="height: 108px;"></textarea>
          </div>
        </div>
      <div class="row">
        <div class="col-sm-12 text-center">
          <button ng-click="save(offer)" class="btn btn-primary">SAVE</button>
          <button ng-click="clear()" class="btn btn-danger">CLEAR</button>
          <a href="viewoffers" class="btn btn-primary">Back</a>
        </div>
      </div>
    </form>

  </div>
</div>
</qm:pageTemplate>


