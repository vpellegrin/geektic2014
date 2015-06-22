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
            when('/geek', {
                templateUrl: 'geek.html',
                controller: 'GeekCtrl'
            }).
            when('/geeks', {
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
    $http.get('/interets').success(function(interets) {
        $scope.lesInterets = interets;
    });

    $scope.search = function(){

        $http.get('/users', {
            params: $scope.criteria
        }).success(function(lesGeeks) {
            $scope.lesGeeks = lesGeeks;
        });

    }
});