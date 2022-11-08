// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

public class DaydreamCompatibility
{
    private final int supportedHeadsets;
    
    public DaydreamCompatibility() {
        this(0);
    }
    
    public DaydreamCompatibility(final int supportedHeadsets) {
        this.supportedHeadsets = supportedHeadsets;
    }
    
    private boolean supportsCardboard() {
        return (this.supportedHeadsets & 0x2) != 0x0;
    }
    
    public int getSupportedHeadsets() {
        return this.supportedHeadsets;
    }
    
    public boolean requiresDaydream() {
        return this.supportsDaydream() && !this.supportsCardboard();
    }
    
    public boolean supportsDaydream() {
        return (this.supportedHeadsets & 0x5) != 0x0;
    }
    
    public int toDeprecated() {
        if (this.requiresDaydream()) {
            return 3;
        }
        if (this.supportsDaydream()) {
            return 2;
        }
        return 1;
    }
}
