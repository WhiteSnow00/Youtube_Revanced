// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

public final class GvrUiLayoutImpl$$ExternalSyntheticLambda1 implements Runnable
{
    public GvrUiLayoutImpl f$0;
    
    public GvrUiLayoutImpl$$ExternalSyntheticLambda1(final GvrUiLayoutImpl f$0) {
        this.f$0 = f$0;
    }
    
    @Override
    public final void run() {
        this.f$0.delayDimmingUiLayerAfterVisible();
    }
}
