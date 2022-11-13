// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import com.google.cardboard.sdk.qrcode.CardboardParamsUtils;
import android.view.View;
import com.google.cardboard.sdk.qrcode.QrCodeContentProcessor;
import com.google.android.gms.vision.barcode.Barcode;
import android.os.Bundle;
import java.io.IOException;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.ConnectionResult;
import android.app.Activity;
import android.os.Build$VERSION;
import android.net.Uri;
import android.content.Intent;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import com.google.cardboard.sdk.qrcode.QrCodeTrackerFactory;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.cardboard.sdk.qrcode.camera.CameraSourcePreview;
import com.google.cardboard.sdk.qrcode.camera.CameraSource;
import com.google.cardboard.sdk.qrcode.QrCodeContentProcessor$Listener;
import com.google.cardboard.sdk.qrcode.QrCodeTracker$Listener;

public class QrCodeCaptureActivity extends fa implements QrCodeTracker$Listener, QrCodeContentProcessor$Listener
{
    private static final int MIN_SDK_VERSION = 23;
    private static final int PERMISSIONS_REQUEST_CODE = 2;
    private static final int RC_HANDLE_GMS = 9001;
    private static final String TAG = "QrCodeCaptureActivity";
    private static boolean qrCodeSaved;
    private CameraSource cameraSource;
    private CameraSourcePreview cameraSourcePreview;
    
    private void createCameraSource() {
        final Context applicationContext = this.getApplicationContext();
        final BarcodeDetectorOptions barcodeDetectorOptions = new BarcodeDetectorOptions();
        barcodeDetectorOptions.a = 256;
        final nnx nnx = new nnx(new noa(applicationContext, barcodeDetectorOptions));
        final QrCodeTrackerFactory b = new QrCodeTrackerFactory((QrCodeTracker$Listener)this);
        final ojg b2 = new ojg();
        b2.b = b;
        synchronized (((nnt)nnx).a) {
            final ojg b3 = ((nnt)nnx).b;
            if (b3 != null) {
                b3.a();
            }
            ((nnt)nnx).b = b2;
            monitorexit(((nnt)nnx).a);
            if (!((nnt)nnx).b()) {
                Toast.makeText((Context)this, R$string.missing_dependencies, 1).show();
                Log.w(QrCodeCaptureActivity.TAG, "QR Code detector is not operational. Try connecting to WiFi and updating Google Play Services or checking that the device storage isn't low.");
            }
            this.cameraSource = new CameraSource(this.getApplicationContext(), (nnt)nnx);
        }
    }
    
    private boolean isCameraEnabled() {
        return td.c((Context)this, "android.permission.CAMERA") == 0;
    }
    
    private boolean isWriteExternalStoragePermissionsEnabled() {
        return td.c((Context)this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
    
    private void launchPermissionsSettings() {
        final Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.getPackageName(), (String)null));
        this.startActivity(intent);
    }
    
    private native void nativeIncrementDeviceParamsChangedCount();
    
    private void requestPermissions() {
        String[] array;
        if (Build$VERSION.SDK_INT < 29) {
            array = new String[] { "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE" };
        }
        else {
            array = new String[] { "android.permission.CAMERA" };
        }
        td.f((Activity)this, array, 2);
    }
    
    private void startCameraSource() {
        final int h = ((mpw)mpv.a).h(this.getApplicationContext(), 23);
        if (h != 0) {
            new ConnectionResult(h).toString();
            mpv.a.a((Activity)this, h, 9001, (DialogInterface$OnCancelListener)null).show();
        }
        final CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            try {
                this.cameraSourcePreview.start(cameraSource);
            }
            catch (final SecurityException ex) {
                Log.e(QrCodeCaptureActivity.TAG, "Security exception: ", (Throwable)ex);
            }
            catch (final IOException ex2) {
                Log.e(QrCodeCaptureActivity.TAG, "Unable to start camera source.", (Throwable)ex2);
                this.cameraSource.release();
                this.cameraSource = null;
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((qt)this).setContentView(R$layout.qr_code_capture);
        this.cameraSourcePreview = (CameraSourcePreview)this.findViewById(R$id.preview);
    }
    
    protected void onPause() {
        super.onPause();
        final CameraSourcePreview cameraSourcePreview = this.cameraSourcePreview;
        if (cameraSourcePreview != null) {
            cameraSourcePreview.stop();
            this.cameraSourcePreview.release();
        }
    }
    
    public void onQrCodeDetected(final Barcode barcode) {
        if (barcode != null && !QrCodeCaptureActivity.qrCodeSaved) {
            QrCodeCaptureActivity.qrCodeSaved = true;
            new QrCodeContentProcessor((QrCodeContentProcessor$Listener)this).processAndSaveQrCode(barcode, (Context)this);
        }
    }
    
    public void onQrCodeSaved(final boolean b) {
        if (b) {
            this.cameraSourcePreview.stop();
            this.nativeIncrementDeviceParamsChangedCount();
            this.finish();
        }
        else {
            Log.e(QrCodeCaptureActivity.TAG, "Device parameters not saved in external storage.");
        }
        QrCodeCaptureActivity.qrCodeSaved = false;
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        super.onRequestPermissionsResult(n, array, array2);
        if (Build$VERSION.SDK_INT < 29) {
            if (!this.isCameraEnabled() || !this.isWriteExternalStoragePermissionsEnabled()) {
                this.getString(R$string.no_permissions);
                Toast.makeText((Context)this, R$string.no_permissions, 1).show();
                if (!td.g((Activity)this, "android.permission.WRITE_EXTERNAL_STORAGE") || !td.g((Activity)this, "android.permission.CAMERA")) {
                    this.launchPermissionsSettings();
                }
                this.finish();
            }
        }
        else if (!this.isCameraEnabled()) {
            this.getString(R$string.no_camera_permission);
            Toast.makeText((Context)this, R$string.no_camera_permission, 1).show();
            if (!td.g((Activity)this, "android.permission.CAMERA")) {
                this.launchPermissionsSettings();
            }
            this.finish();
        }
    }
    
    protected void onResume() {
        super.onResume();
        if (this.isCameraEnabled() && (Build$VERSION.SDK_INT >= 29 || this.isWriteExternalStoragePermissionsEnabled())) {
            this.createCameraSource();
            QrCodeCaptureActivity.qrCodeSaved = false;
            this.startCameraSource();
            return;
        }
        this.requestPermissions();
    }
    
    public void skipQrCodeCapture(final View view) {
        final Context applicationContext = this.getApplicationContext();
        if (CardboardParamsUtils.readDeviceParams(applicationContext) == null) {
            CardboardParamsUtils.saveCardboardV1DeviceParams(applicationContext);
        }
        this.finish();
    }
}
