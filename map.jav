function initMap() {
    var location = { lat: -40.9006, lng: 174.886 };

    let map = new google.maps.Map(document.getElementById("map"), {
      zoom: 5.7,
      center: location,
      mapTypeControlOptions: {
        mapTypeIds: ["none"],
        madId: "78772629ea332896",
      },
    });

    /*God Heavens Stargazing*/
    var markerOptions = {
      position: new google.maps.LatLng(-36.2693, 175.49683),
    };
    let marker = new google.maps.Marker(markerOptions);

    /*Great Barrier Island*/
    var markerOptions2 = {
      position: new google.maps.LatLng(-36.311859, 175.49649),
    };
    let marker2 = new google.maps.Marker(markerOptions2);

    /*Dark Sky Project*/
    var markerOptions3 = {
      position: new google.maps.LatLng(-44.0035, 170.47735),
    };
    let marker3 = new google.maps.Marker(markerOptions3);

    /*Under The Stars*/
    var markerOptions4 = {
      position: new google.maps.LatLng(-41.0839, 175.45686),
    };
    let marker4 = new google.maps.Marker(markerOptions4);

    /*Christchurch Astro Tours*/
    var markerOptions5 = {
      position: new google.maps.LatLng(-43.68513, 172.50155),
    };
    let marker5 = new google.maps.Marker(markerOptions5);

    /*Pukaki Wine Cellar*/
    var markerOptions6 = {
      position: new google.maps.LatLng(-43.735470, 170.101070),
    };
    let marker6 = new google.maps.Marker(markerOptions6);

    /*Castlepoint*/
    var markerOptions7 = {
      position: new google.maps.LatLng(-40.902500, 176.227000),
    };
    let marker7 = new google.maps.Marker(markerOptions7);

    marker.setMap(map);
    marker2.setMap(map);
    marker3.setMap(map);
    marker4.setMap(map);
    marker5.setMap(map);
    marker6.setMap(map);
    marker7.setMap(map);

  /*Make the info cards of the markers*/
  /*Good Heavens Stargazing */
    var contentString = 
      `
      <div class="card-section-map">
        <div class="image1">
          <img src="/Images/Map-Images/Good Heavens Stargazing.jpg" alt="Good Heavens" class="map-image">
        </div>
        <h1 class = "container-title">Good Heavens Stargazing Experiences</h1>
        <p class = "container-paragraph">Lean back in a comfy chair, listen to the waves as the Milky Way comes into focus friendly island guides entertain you with interesting facts and fascinating stories. And illuminate our planet’s place in the universe, while you get lost in the stars. </p>
        <a href="https://www.newzealand.com/nz/plan/business/good-heavens-stargazing-experiences-local-guides-seaside-dark-sky-sanctuary/" class="btn">Learn More...</a>
      </div>
        `;
   
    var infoWindowOptions = {
      content: contentString,
      position: new google.maps.LatLng(-36.2693, 175.49683),
      maxWidth: 600,
      maxHeight:10000,
    }


    /*Great Barrier Island */
    var contentString1 = 
      `
      <div class="card-section-map">
        <div class="image1">
          <img src="/Images/Map-Images/great barrier island.jfif" alt="Great Barrier Island" class="map-image">
        </div>
        <h1 class = "container-title">Great Barrier Island</h1>
        <p class = "container-paragraph">Great Barrier Island - perfect for star-gazing enthusiasts. The forests, beaches and bays provide scope for all kinds of wilderness adventures.</p>
        <a href="https://www.newzealand.com/nz/great-barrier-island/" class="btn">Learn More...</a>
      </div>
        `;
   
    var infoWindowOptions1 = {
      content: contentString1,
      position: new google.maps.LatLng(-36.311859, 175.49649),
      maxWidth: 600,
      maxHeight:10000,
    }

       /*Dark Sky Project */
       var contentString2 = 
       `
       <div class="card-section-map">
         <div class="image1">
           <img src="/Images/Map-Images/Dark Sky Project.jpg" alt="Dark Sky Project" class="map-image">
         </div>
         <h1 class = "container-title dark-sky-title">Dark Sky Project, Takapō</h1>
         <p class = "container-paragraph">Embark on an interactive journey delivering insight into the world of tātai aroraki (Māori astronomy) and partake in the Dark Sky Project stargazing experience at Mt John Observatory. </p>
         <a href="https://www.darkskyproject.co.nz/" class="btn">Learn More...</a>
       </div>
         `;
    
     var infoWindowOptions2 = {
       content: contentString2,
       position: new google.maps.LatLng(-44.0035, 170.47735),
       maxWidth: 600,
       maxHeight:10000,
     }

     
       /*Under The Stars */
       var contentString3 = 
       `
       <div class="card-section-map">
         <div class="image1">
           <img src="/Images/Map-Images/Under the Stars.png" alt="Under the Stars" class="map-image">
         </div>
         <h1 class = "container-title">Under The Stars</h1>
         <p class = "container-paragraph">Stargazing is a wonderful, accessible and low risk activity available all year round. Whether your guests know nothing, something or a lot about astronomy, everyone will enjoy it. </p>
         <a href="https://www.newzealand.com/nz/plan/business/under-the-stars-wairarapa-astronomy/" class="btn">Learn More...</a>
       </div>
         `;
    
     var infoWindowOptions3 = {
       content: contentString3,
       position: new google.maps.LatLng(-41.0839, 175.45686),
       maxWidth: 600,
       maxHeight:10000,
     }

         /*Christchurch Astro Tours*/
         var contentString4 = 
         `
         <div class="card-section-map">
           <div class="image1">
             <img src="/Images/Map-Images/Christchurch astroturf.png" alt="Christchurch AstroTurf" class="map-image">
           </div>
           <h1 class = "container-title">Christchurch Astro Tours</h1>
           <p class = "container-paragraph">Christchurch Astro Tours introduce you to the southern night sky. Operating from a location a mere 30 minutes south of central Christchurch.. </p>
           <a href="https://www.newzealand.com/nz/plan/business/christchurch-astro-tours/" class="btn">Learn More...</a>
         </div>
           `;
      
       var infoWindowOptions4 = {
         content: contentString4,
         position: new google.maps.LatLng(-41.0839, 175.45686),
         maxWidth: 600,
         maxHeight:10000,
       }

       /*Pukaki Wine Cellar*/
       var contentString5 = 
         `
         <div class="card-section-map">
           <div class="image1">
             <img src="/Images/Map-Images/Pukaki Wine Cellar.jpg" alt="Christchurch AstroTurf" class="map-image">
           </div>
           <h1 class = "container-title">Pukaki Wine Cellar Observatory Stargazing</h1>
           <p class = "container-paragraph">Pukaki Wine Cellar Observatory offers a small group stargazing experience of the Aoraki Mackenzie International Dark Sky Reserve. Located at Mt Cook Lakeside Estate & Retreat, the Observatory offers a personalised 2-3 hour experience. </p>
           <a href="https://www.newzealand.com/nz/plan/business/pukaki-wine-cellar-observatory/" class="btn">Learn More...</a>
         </div>
           `;
      
       var infoWindowOptions5 = {
         content: contentString5,
         position: new google.maps.LatLng(-43.735470, 170.101070),
         maxWidth: 600,
         maxHeight:10000,
       }

        /*CastlePoint Scenic Reserve*/
        var contentString6 = 
        `
        <div class="card-section-map">
          <div class="image1">
            <img src="/Images/Map-Images/Castepoint.jpg" alt="Castlepoint Scenic Drive" class="map-image">
          </div>
          <h1 class = "container-title">Castlepoint Scenic Reserve</h1>
          <p class = "container-paragraph"> At Castlepoint you can hunt for one of the world&#180;s rarest daisies, climb Castle Rock or watch the waves for dolphins and fur seals.</p>
          <a href="https://www.newzealand.com/nz/feature/castlepoint-scenic-reserve/" class="btn">Learn More...</a>
        </div>
          `;
     
      var infoWindowOptions6 = {
        content: contentString6,
        position: new google.maps.LatLng(-40.902500, 176.227000),
        maxWidth: 600,
        maxHeight:10000,
      }
  

    var infoWindow = new google.maps.InfoWindow(infoWindowOptions)
    var infoWindow1 = new google.maps.InfoWindow(infoWindowOptions1)
    var infoWindow2 = new google.maps.InfoWindow(infoWindowOptions2)
    var infoWindow3 = new google.maps.InfoWindow(infoWindowOptions3)
    var infoWindow4 = new google.maps.InfoWindow(infoWindowOptions4)
    var infoWindow5 = new google.maps.InfoWindow(infoWindowOptions5)
    var infoWindow6 = new google.maps.InfoWindow(infoWindowOptions6)

    var infoWindowOpenOptions = {
      map: map,
      anchor: marker,
      shouldFocus: false
    }

    var infoWindowOpenOptions1 = {
      map: map,
      anchor: marker2,
      shouldFocus: false
    }
    
    var infoWindowOpenOptions2 = {
      map: map,
      anchor: marker3,
      shouldFocus: false
    }

    var infoWindowOpenOptions3 = {
      map: map,
      anchor: marker4,
      shouldFocus: false
    }

    var infoWindowOpenOptions4 = {
      map: map,
      anchor: marker5,
      shouldFocus: false
    }

    var infoWindowOpenOptions5 = {
      map: map,
      anchor: marker6,
      shouldFocus: false
    }

    var infoWindowOpenOptions6 = {
      map: map,
      anchor: marker7,
      shouldFocus: false
    }

    marker.addListener("click", () => {
      infoWindow.open(infoWindowOpenOptions);
    });

    marker2.addListener("click", () => {
      infoWindow1.open(infoWindowOpenOptions1);
    });

    marker3.addListener("click", () => {
      infoWindow2.open(infoWindowOpenOptions2);
    });

    marker4.addListener("click", () => {
      infoWindow3.open(infoWindowOpenOptions3);
    });

    marker5.addListener("click", () => {
      infoWindow4.open(infoWindowOpenOptions4);
    });

    marker6.addListener("click", () => {
      infoWindow5.open(infoWindowOpenOptions5);
    });

    marker7.addListener("click", () => {
      infoWindow6.open(infoWindowOpenOptions6);
    });
  }
  
  