package com.example.asuspc.mapspractice;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng makati = new LatLng(14.554729, 121.024445);
        LatLng prsM = new LatLng(14.5913, 120.9700);
        LatLng mdh = new LatLng(14.5819, 120.9830);
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(makati , 11f) );
//        mMap.addMarker(new MarkerOptions()
//                .position(manila).title("Manila"));
//
//        mMap.addMarker(new MarkerOptions()
//                .position(stluke).title("St. Lukes Hospital"));

        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(prsM)
                .anchor(0.5f, 0.5f)
                .title("Philippines Red Cross National Headquarters")
                .snippet("Million Volunteer Run")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(makati)
                .anchor(0.5f, 0.5f)
                .title("Manila"));

        Marker m3 = googleMap.addMarker(new MarkerOptions()
                .position(mdh)
                .anchor(0.5f, 0.5f)
                .title("Manila Doctors Hospital")
                .snippet("Bloodletting Campaign").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


//        mMap.moveCamera(CameraUpdateFactory.newLatLng(manila));
    }

}
