
import android.app.Activity;
import android.content.Context;
//import android.graphics.Camera;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;

import com.example.nitinpandit.realtimeassisstant.CameraPreview;
import com.example.nitinpandit.realtimeassisstant.R;

import java.io.IOException;

public class CameraActivity extends Activity {

    private Camera mCamera;
    private CameraPreview mPreview;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        // Create an instance of Camera
        mCamera = CameraPreview.getCameraInstance();

        // Create our Preview view and set it as the content of our activity.
        mPreview = new CameraPreview(this, mCamera);
        FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        preview.addView(mPreview);
    }


}

