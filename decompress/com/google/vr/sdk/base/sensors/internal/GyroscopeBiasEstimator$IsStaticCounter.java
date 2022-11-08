// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base.sensors.internal;

class GyroscopeBiasEstimator$IsStaticCounter
{
    private int consecutiveIsStatic;
    private final int minStaticFrames;
    
    public GyroscopeBiasEstimator$IsStaticCounter(final int n) {
        this.minStaticFrames = 10;
    }
    
    public void appendFrame(final boolean b) {
        int consecutiveIsStatic;
        if (!b) {
            consecutiveIsStatic = 0;
        }
        else {
            consecutiveIsStatic = this.consecutiveIsStatic + 1;
        }
        this.consecutiveIsStatic = consecutiveIsStatic;
    }
    
    public boolean isRecentlyStatic() {
        return this.consecutiveIsStatic >= this.minStaticFrames;
    }
}
