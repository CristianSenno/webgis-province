<!doctype html>

<html lang="en">
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/openlayers/openlayers.github.io@master/en/v6.5.0/css/ol.css">

  <meta charset="utf-8">

  <title>WebGIS</title>
  <meta name="description" content="WebGIS">
  <meta name="author" content="3DGIS">
	<style>
		html, body, #map {
			padding: 0;
			margin: 0;
			height: 100%;
			width: 100%;
		}
	</style>
		<script src="https://cdn.jsdelivr.net/gh/openlayers/openlayers.github.io@master/en/v6.5.0/build/ol.js"></script>
	
</head>

<body>
	<div id="map"></div>
	
	<div id="container" style="background:black; width:150px;">
	
		<span id="denUts" style="color:white; padding-left:5px;"></span><br>
		<span id="sigla" style="color:white; padding-left:5px;"></span><br>
		<span id="denCm" style="color:white; padding-left:5px;"></span><br>
		<span id="tipoUts" style="color:white; padding-left:5px;"></span><br>
	</div>
	
	<script type="text/javascript">
	
	
		var vectorLayer = new ol.layer.Vector({
	  		source: new ol.source.Vector({			
	    		url: '/province/list',
	    		format: new ol.format.GeoJSON(),
	  		}),
	  		style: new ol.style.Style({
          stroke: new ol.style.Stroke({
            color: 'black',
            width: 2
          }),
          fill: new ol.style.Fill({
            color: 'rgba(255,0,0,0.2)'
          })
        })
		});
	
	  var map = new ol.Map({
	    target: 'map',
	    layers: [
	      new ol.layer.Tile({
	        source: new ol.source.OSM()
	      }),
	      vectorLayer
	    ],
	    view: new ol.View({
	      center: ol.proj.fromLonLat([12, 40.82]),
	      zoom: 6
	    })
	  });
	  
	  
	var overlayContainer = document.getElementById('container');
	
	var overlayLayer = new ol.Overlay({
		element: overlayContainer
	});
	  
	 map.addOverlay(overlayLayer); 
	 
	 var overlayUts = document.getElementById('denUts');
	 var overlaySigla = document.getElementById('sigla');
	 var overlayCm = document.getElementById('denCm');
	 var overlayTipo = document.getElementById('tipoUts');
	 
	map.on('click', function(event){
		
		overlayLayer.setPosition(undefined);
		
		map.forEachFeatureAtPixel(event.pixel, function(feature, layer){
			
			var coord = event.coordinate;
			var FDenUts = feature.get('denUts');
			var Fsigla = feature.get('sigla');
			var Fcm = feature.get('denCm');
			var Ftipo = feature.get('tipoUts'); 
			
			overlayLayer.setPosition(coord);
			overlayUts.innerHTML = "denUts: " + FDenUts;
			overlaySigla.innerHTML = "Sigla: " + Fsigla;
			overlayCm.innerHTML = "denCm: " + Fcm;
			overlayTipo.innerHTML = "tipoUts: " + Ftipo;
			});
	});
	
	</script>
</body>
</html>