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
    final SdkDaydreamTouchListener this$0;
    
    private SdkDaydreamTouchListener$FinishInitializationTask(final SdkDaydreamTouchListener this$0) {
        this.this$0 = this$0;
    }
    
    public SdkDaydreamTouchListener$FinishInitializationTask(final SdkDaydreamTouchListener sdkDaydreamTouchListener, final SdkDaydreamTouchListener$FinishInitializationTask-IA sdkDaydreamTouchListener$FinishInitializationTask-IA) {
        this(sdkDaydreamTouchListener);
    }
    
    protected Display$DisplayParams doInBackground(final Void... array) {
        return SdkDaydreamTouchListener.-$$Nest$fgetvrParamsProvider(this.this$0).d();
    }
    
    protected /* bridge */ Object doInBackground(final Object[] array) {
        return this.doInBackground((Void[])array);
    }
    
    protected void onPostExecute(final Display$DisplayParams display$DisplayParams) {
        SdkDaydreamTouchListener.-$$Nest$minit(this.this$0, arbu.q(this.display, display$DisplayParams), display$DisplayParams, arbu.f(this.display));
    }
    
    protected /* bridge */ void onPostExecute(final Object o) {
        this.onPostExecute((Display$DisplayParams)o);
    }
    
    protected /* bridge */ void onProgressUpdate(final Object[] array) {
        final Void[] array2 = (Void[])array;
    }
}
