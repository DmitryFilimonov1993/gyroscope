package com.example.testsensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.hardware.TriggerEvent
import android.hardware.TriggerEventListener
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var sensorManager: SensorManager
    private lateinit var sensorGyroscope: Sensor
    private lateinit var gyroscopeListener: GyroscopeListener

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorGyroscope = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)

        gyroscopeListener = GyroscopeListener()
    }

    override fun onStart() {
        super.onStart()
        sensorManager.registerListener(gyroscopeListener, sensorGyroscope, SensorManager.SENSOR_DELAY_NORMAL)

    }

    inner class GyroscopeListener: SensorEventListener{
        override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onSensorChanged(event: SensorEvent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}
