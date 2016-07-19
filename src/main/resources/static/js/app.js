var app=angular.module("myCatalogue",[])

app.controller("CatController",function($scope,$http){
	$scope.motcle=null;
	$scope.page=0;
	$scope.produits=[];
	$scope.charger=function(){$http.get('/ProduitParMc?mc='+$scope.motcle+'&page='+$scope.page)
		.success(function(data){
			$scope.produits=data;
			$scope.pages=new Array(data.totalPages);
		});
	};
		
	$scope.goTo=function(p){
		$scope.page=p;
		$scope.charger();
	};
});