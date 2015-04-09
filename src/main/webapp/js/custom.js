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