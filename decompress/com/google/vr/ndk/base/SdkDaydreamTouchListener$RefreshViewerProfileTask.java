// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.os.AsyncTask;

class SdkDaydreamTouchListener$RefreshViewerProfileTask extends AsyncTask
{
    final /* synthetic */ SdkDaydreamTouchListener this$0;
    
    private SdkDaydreamTouchListener$RefreshViewerProfileTask(final SdkDaydreamTouchListener this$0) {
        this.this$0 = this$0;
    }
    
    protected CardboardDevice$DeviceParams doInBackground(final Void... array) {
        return SdkDaydreamTouchListener.-$$Nest$fgetvrParamsProvider(this.this$0).b();
    }
    
    protected void onPostExecute(final CardboardDevice$DeviceParams deviceParams) {
        this.this$0.setDeviceParams(deviceParams);
    }
}
