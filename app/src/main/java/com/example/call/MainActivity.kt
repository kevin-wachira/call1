package com.example.call

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener


class MainActivity : AppCompatActivity() {

    private val MY_PERMISSIONS_REQUEST_READ_READSMS=100
    val OTP_REGEX = "[0-9]{1,6}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Dexter.withActivity(this)
            .withPermission(Manifest.permission.RECEIVE_SMS)
            .withListener(object : PermissionListener {
                override fun onPermissionGranted(response: PermissionGrantedResponse) { /* ... */
                }

                override fun onPermissionDenied(response: PermissionDeniedResponse) { /* ... */
                }

                override fun onPermissionRationaleShouldBeShown(
                    permission: PermissionRequest?,
                    token: PermissionToken?
                ) { /* ... */
                }
            }).check()


    }
}
/*{




    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        val phoneNumber= " 0714556212"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlocate.onClick {
        doAsync {

//        makeCall("0714556212")
            val result = makeCall("0714556212")
            uiThread {
                (result)
            }
        }
        }

        btnsnap.onClick {
            makeCall(number = "0714556212")
        }
    }
}*/
