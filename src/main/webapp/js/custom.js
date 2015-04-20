var app = angular.module('app', [ 'ngSanitize', 'ngGrid', 'mgcrea.ngStrap' ,'ui.select']);

/* =========== User =========== */
app
    .controller(
        'UserController',
        function($scope, $http) {
        	
        	$scope.save = function(user) {
                $http.post('/user/save', JSON.stringify(user), {
                  contentType : 'application/json',
                  dataType : 'json'
                }).then(function(res) {
                	console.log(JSON.stringify(user));
                  /*$scope.loadData();
                  // reset form
                  $scope.employee = {};
                  $scope.form.$setPristine();*/
                });
            };
            
            $scope.clear = function() {
            	$scope.user = {};
            	$scope.form.$setPristine();
            };
        	
        });
        
/*==========Offer==============*/

app        
    .controller(
        'OfferController',
        function($scope, $http) {
        $scope.mySelections = [];
        $scope.loadData = function() {
            $http.get('/offer/data.json').then(function(res) {
              console.log(res.data);
              $scope.offers = res.data;
            });
          }
        $scope.loadData();
        $scope.makeColDefs = function(row) {
            var colDefs = [ {
              field : 'id',
              displayName : 'Id',
              resizable : false,
              width : '30px'
            }, 
            {
              field : 'startDate',
              cellFilter: 'date:\'dd.MM.yyyy\'',
              displayName : 'Start Date'
            },
                {
              field : 'endDate',
              cellFilter: 'date:\'dd.MM.yyyy\'',
              displayName : 'End Date'
            }, 
            {
              field : 'companyName',
              displayName : 'Company Name'
            },
            {
              field : 'phonenr',
              displayName : 'Phone number'
            }, 
            {
              field : 'mail',
              displayName : 'Email'
            },
            {
              field : 'address',
              displayName : 'Address'
            },
            {
              field : 'offerName',
              displayName : 'Offer Name'
            },
            {
              field : 'content',
              displayName : 'Description'
            },
            {
              field : 'wage',
              displayName : 'Wage'
            }];
            return colDefs
            };
            
            $scope.gridOptions = {
            data : 'offers',
            columnDefs : $scope.makeColDefs(),
            selectedItems: $scope.mySelections,
            multiSelect : false,
            filterOptions: {filterText: '', useExternalFilter: false},
   			showFilter: true,
            
             
          };
        	
        	$scope.save = function(offer) {
                console.log(JSON.stringify(offer));
                $http.post('/offer/save', JSON.stringify(offer), {
                  contentType : 'application/json',
                  dataType : 'json'
                }).then(function(res) {
                	console.log(JSON.stringify(offer));
                  
                  $scope.offer = {};
                  $scope.form.$setPristine();
                  window.location.replace("/viewoffers");
                });
            };
            
            $scope.clear = function() {
            	$scope.offer = {};
            	$scope.form.$setPristine();
            };
        	
        });