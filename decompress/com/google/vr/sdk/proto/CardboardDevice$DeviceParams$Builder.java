// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public final class CardboardDevice$DeviceParams$Builder extends agza implements ahax
{
    private CardboardDevice$DeviceParams$Builder() {
        super((agzi)CardboardDevice$DeviceParams.DEFAULT_INSTANCE);
    }
    
    public CardboardDevice$DeviceParams$Builder addAllDistortionCoefficients(final Iterable iterable) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).addAllDistortionCoefficients(iterable);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder addAllLeftEyeFieldOfViewAngles(final Iterable iterable) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).addAllLeftEyeFieldOfViewAngles(iterable);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearDistortionCoefficients() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearDistortionCoefficients();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearLeftEyeFieldOfViewAngles() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearLeftEyeFieldOfViewAngles();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setHasMagnet(final boolean b) {
        this.copyOnWrite();
        CardboardDevice$DeviceParams.access$3100((CardboardDevice$DeviceParams)this.instance, true);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setInterLensDistance(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setInterLensDistance(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setModel(final String s) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setModel(s);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setScreenToLensDistance(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setScreenToLensDistance(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setTrayToLensDistance(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setTrayToLensDistance(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVendor(final String s) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setVendor(s);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVerticalAlignment(final CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setVerticalAlignment(cardboardDevice$DeviceParams$VerticalAlignmentType);
        return this;
    }
}
