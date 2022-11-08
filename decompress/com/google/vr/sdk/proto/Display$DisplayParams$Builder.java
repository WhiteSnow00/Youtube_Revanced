// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public final class Display$DisplayParams$Builder extends agza implements ahax
{
    private Display$DisplayParams$Builder() {
        super((agzi)Display$DisplayParams.access$000());
    }
    
    public float getXPpi() {
        return ((Display$DisplayParams)this.instance).getXPpi();
    }
    
    public float getYPpi() {
        return ((Display$DisplayParams)this.instance).getYPpi();
    }
    
    public Display$DisplayParams$Builder setBottomBezelHeight(final float n) {
        this.copyOnWrite();
        Display$DisplayParams.access$500((Display$DisplayParams)this.instance, n);
        return this;
    }
    
    public Display$DisplayParams$Builder setXPpi(final float n) {
        this.copyOnWrite();
        Display$DisplayParams.access$100((Display$DisplayParams)this.instance, n);
        return this;
    }
    
    public Display$DisplayParams$Builder setYPpi(final float n) {
        this.copyOnWrite();
        Display$DisplayParams.access$300((Display$DisplayParams)this.instance, n);
        return this;
    }
}
