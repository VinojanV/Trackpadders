package com.example.vinoj.trackpadders.module_one;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    View trackPad; // trackPad view
    //BluetoothAdapter btAdapter; // default adapter
    //BluetoothSocket btSocket;// socket for communication

    //public final UUID uuid = UUID.fromString("94f39d29-7d6d-437d-973b-fba39e49d4ee"); // uuid for laptop
    // input stream to send to computer
    //OutputStream BtStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        trackPad = findViewById(R.id.trackPad); // get trackpad
        // get the default adapter used by android
       // btAdapter = BluetoothAdapter.getDefaultAdapter();

        // bluetooth setup here
        //BtInit();
        //BluetoothManager btManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
        //btAdapter = btManager.getAdapter();
        //Set<BluetoothDevice> bondedDevs;
        //if (btAdapter != null) {
        //    bondedDevs = btAdapter.getBondedDevices();
         //   BtInit(bondedDevs);
        //}
        //btAdapter.getBondedDevices();

        // when the view is touched
        trackPad.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                float xAxis = event.getX();
                float yAxis = event.getY();
                switch(event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        //path.moveTo(xAxis,yAxis)
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        //path.moveTo(xAxis,yAxis);
                        String m = Float.toString(xAxis);
                        String n = Float.toString(yAxis);
                        // send data to computer
                        /*try {
                            BtStream.write((int) xAxis);
                        } catch (java.io.IOException e) {

                        }*/
                        System.out.println(m + " " + n);
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });

    }
    /**
    void BtInit(Set<BluetoothDevice> bondedDevs) {
        BluetoothDevice targetDev;// target device
        for (BluetoothDevice device : bondedDevs) {
            targetDev = device;
            if (device.getName().equals("LAPTOP1")) {
                bluedeviceSetup(device);
                break;
            }
            System.out.println(device.getName());
        }
    }
    // setup bluetooth device
    void bluedeviceSetup(BluetoothDevice device) {
        try {
        btSocket = device.createRfcommSocketToServiceRecord(uuid);
        // connect to device
        btSocket.connect();
        // get the stream for comm
        BtStream = btSocket.getOutputStream(); // get input stream
        } catch (java.io.IOException e) {
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        return super.onGenericMotionEvent(event);
    }
    **/
}
