// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public final class CardboardDevice$DeviceParams$Builder extends ahaz implements ahcw
{
    private CardboardDevice$DeviceParams$Builder() {
        super((ahbh)CardboardDevice$DeviceParams.access$000());
    }
    
    public CardboardDevice$DeviceParams$Builder(final CardboardDevice$1 cardboardDevice$1) {
        this();
    }
    
    public CardboardDevice$DeviceParams$Builder addAllDistortionCoefficients(final Iterable iterable) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$2100((CardboardDevice$DeviceParams)this.instance, iterable);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder addAllLeftEyeFieldOfViewAngles(final Iterable iterable) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$1300((CardboardDevice$DeviceParams)this.instance, iterable);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearDistortionCoefficients() {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$2200((CardboardDevice$DeviceParams)this.instance);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearLeftEyeFieldOfViewAngles() {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$1400((CardboardDevice$DeviceParams)this.instance);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setHasMagnet(final boolean b) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$3100((CardboardDevice$DeviceParams)this.instance, true);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setInterLensDistance(final float n) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$900((CardboardDevice$DeviceParams)this.instance, n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setModel(final String s) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$400((CardboardDevice$DeviceParams)this.instance, s);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setScreenToLensDistance(final float n) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$700((CardboardDevice$DeviceParams)this.instance, n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setTrayToLensDistance(final float n) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$1700((CardboardDevice$DeviceParams)this.instance, n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVendor(final String s) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$100((CardboardDevice$DeviceParams)this.instance, s);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVerticalAlignment(final CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$1500((CardboardDevice$DeviceParams)this.instance, cardboardDevice$DeviceParams$VerticalAlignmentType);
        return this;
    }
}
