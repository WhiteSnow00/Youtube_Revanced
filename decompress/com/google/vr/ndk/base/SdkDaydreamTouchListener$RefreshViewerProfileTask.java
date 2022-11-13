// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.os.AsyncTask;

class SdkDaydreamTouchListener$RefreshViewerProfileTask extends AsyncTask
{
    final SdkDaydreamTouchListener this$0;
    
    private SdkDaydreamTouchListener$RefreshViewerProfileTask(final SdkDaydreamTouchListener this$0) {
        this.this$0 = this$0;
    }
    
    public SdkDaydreamTouchListener$RefreshViewerProfileTask(final SdkDaydreamTouchListener sdkDaydreamTouchListener, final SdkDaydreamTouchListener$RefreshViewerProfileTask-IA sdkDaydreamTouchListener$RefreshViewerProfileTask-IA) {
        this(sdkDaydreamTouchListener);
    }
    
    protected CardboardDevice$DeviceParams doInBackground(final Void... array) {
        return SdkDaydreamTouchListener.-$$Nest$fgetvrParamsProvider(this.this$0).b();
    }
    
    protected /* bridge */ Object doInBackground(final Object[] array) {
        return this.doInBackground((Void[])array);
    }
    
    protected void onPostExecute(final CardboardDevice$DeviceParams deviceParams) {
        ((AbstractDaydreamTouchListener)this.this$0).setDeviceParams(deviceParams);
    }
    
    protected /* bridge */ void onPostExecute(final Object o) {
        this.onPostExecute((CardboardDevice$DeviceParams)o);
    }
    
    protected /* bridge */ void onProgressUpdate(final Object[] array) {
        final Void[] array2 = (Void[])array;
    }
}
