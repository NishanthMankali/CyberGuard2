package com.example.cyberguard

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.io.File
import java.io.FileWriter

class NetworkMonitorService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        monitorNetworkTraffic()
        return START_STICKY
    }

    private fun monitorNetworkTraffic() {
        Log.d("NetworkMonitor", "Monitoring network traffic...")

        val logFile = File(filesDir, "network_logs.txt")
        val writer = FileWriter(logFile, true)
        val encryptedLog = EncryptionUtil.encrypt("Sample log entry")
        writer.append(encryptedLog).append("\n")
        writer.flush()
        writer.close()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
