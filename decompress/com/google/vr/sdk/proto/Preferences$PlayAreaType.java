// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum Preferences$PlayAreaType implements ahbl
{
    private static final Preferences$PlayAreaType[] $VALUES;
    
    GVR_PLAY_AREA_TYPE_NOT_SET("GVR_PLAY_AREA_TYPE_NOT_SET", 0, 0);
    
    public static final int GVR_PLAY_AREA_TYPE_NOT_SET_VALUE = 0;
    
    GVR_PLAY_AREA_TYPE_RADIAL("GVR_PLAY_AREA_TYPE_RADIAL", 1, 1);
    
    public static final int GVR_PLAY_AREA_TYPE_RADIAL_VALUE = 1;
    private static final ahbm internalValueMap;
    private final int value;
    
    private static Preferences$PlayAreaType[] $values() {
        return new Preferences$PlayAreaType[] { Preferences$PlayAreaType.GVR_PLAY_AREA_TYPE_NOT_SET, Preferences$PlayAreaType.GVR_PLAY_AREA_TYPE_RADIAL };
    }
    
    static {
        $VALUES = $values();
        internalValueMap = (ahbm)new Preferences$PlayAreaType$1();
    }
    
    private Preferences$PlayAreaType(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static Preferences$PlayAreaType forNumber(final int n) {
        if (n == 0) {
            return Preferences$PlayAreaType.GVR_PLAY_AREA_TYPE_NOT_SET;
        }
        if (n != 1) {
            return null;
        }
        return Preferences$PlayAreaType.GVR_PLAY_AREA_TYPE_RADIAL;
    }
    
    public static ahbn internalGetVerifier() {
        return Preferences$PlayAreaType$PlayAreaTypeVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
