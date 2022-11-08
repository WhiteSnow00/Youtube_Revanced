// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;

public class DaydreamUtilsWrapper
{
    public DaydreamCompatibility getComponentDaydreamCompatibility(final Context context) {
        final ComponentName u = aqzg.u(context);
        if (u != null) {
            return DaydreamUtils.getComponentDaydreamCompatibility(context, u);
        }
        return new DaydreamCompatibility();
    }
    
    public boolean isDaydreamActivity(final Activity activity) {
        return this.isDaydreamComponent((Context)activity);
    }
    
    public boolean isDaydreamComponent(final Context context) {
        return this.getComponentDaydreamCompatibility(context).supportsDaydream();
    }
    
    public boolean isDaydreamPhone(final Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }
    
    public boolean isDaydreamRequiredComponent(final Context context) {
        return this.getComponentDaydreamCompatibility(context).requiresDaydream();
    }
}
