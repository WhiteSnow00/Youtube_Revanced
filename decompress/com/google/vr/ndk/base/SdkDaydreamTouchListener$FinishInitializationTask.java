// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.sdk.proto.Display$DisplayParams;
import android.view.Display;
import android.os.AsyncTask;

class SdkDaydreamTouchListener$FinishInitializationTask extends AsyncTask
{
    public Display display;
    final /* synthetic */ SdkDaydreamTouchListener this$0;
    
    private SdkDaydreamTouchListener$FinishInitializationTask(final SdkDaydreamTouchListener this$0) {
        this.this$0 = this$0;
    }
    
    protected Display$DisplayParams doInBackground(final Void... array) {
        return SdkDaydreamTouchListener.-$$Nest$fgetvrParamsProvider(this.this$0).d();
    }
    
    protected void onPostExecute(final Display$DisplayParams display$DisplayParams) {
        SdkDaydreamTouchListener.-$$Nest$minit(this.this$0, aqzg.q(this.display, display$DisplayParams), display$DisplayParams, aqzg.f(this.display));
    }
}
