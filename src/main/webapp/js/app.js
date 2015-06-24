var app = angular.module("geektic", ['ngRoute']);

app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'welcome.html',
                controller: 'IndexCtrl'
            }).
            when('/search', {
                templateUrl: 'search.html',
                controller: 'SearchCtrl'
            }).
            when('/geeks/:id', {
                templateUrl: 'geeks.html',
                controller: 'GeeksCtrl'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);
app.controller('IndexCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('SearchCtrl', function($scope, $http) {
    $http.get('api/interets').success(function(interets) {
        $scope.lesInterets = interets;
    });
    $scope.criteria = [];

    $scope.search = function(){

        $http.get('api/geeks', {
            params: $scope.criteria
        }).success(function(lesGeeks) {
            $scope.lesGeeks = lesGeeks;
        });

    }


});


app.controller('GeeksCtrl', function($scope, $http, $routeParams) {
    $http.get('api/geeks/' + $routeParams.id).success(function(leGeek) {
        $scope.leGeek = leGeek;
    });


});