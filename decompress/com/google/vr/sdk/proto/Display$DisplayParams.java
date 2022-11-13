// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Display$DisplayParams extends ahbh implements ahcw
{
    public static final int BOTTOM_BEZEL_HEIGHT_FIELD_NUMBER = 3;
    private static final Display$DisplayParams DEFAULT_INSTANCE;
    public static final int DEPRECATED_GYRO_BIAS_FIELD_NUMBER = 4;
    private static volatile ahdd PARSER;
    public static final int X_PPI_FIELD_NUMBER = 1;
    public static final int Y_PPI_FIELD_NUMBER = 2;
    private int bitField0_;
    private float bottomBezelHeight_;
    private int dEPRECATEDGyroBiasMemoizedSerializedSize;
    private ahbo dEPRECATEDGyroBias_;
    private float xPpi_;
    private float yPpi_;
    
    static {
        ahbh.registerDefaultInstance((Class)Display$DisplayParams.class, (ahbh)(DEFAULT_INSTANCE = new Display$DisplayParams()));
    }
    
    private Display$DisplayParams() {
        this.dEPRECATEDGyroBiasMemoizedSerializedSize = -1;
        this.dEPRECATEDGyroBias_ = emptyFloatList();
    }
    
    static Display$DisplayParams access$000() {
        return Display$DisplayParams.DEFAULT_INSTANCE;
    }
    
    static void access$100(final Display$DisplayParams display$DisplayParams, final float xPpi) {
        display$DisplayParams.setXPpi(xPpi);
    }
    
    static void access$300(final Display$DisplayParams display$DisplayParams, final float yPpi) {
        display$DisplayParams.setYPpi(yPpi);
    }
    
    static void access$500(final Display$DisplayParams display$DisplayParams, final float bottomBezelHeight) {
        display$DisplayParams.setBottomBezelHeight(bottomBezelHeight);
    }
    
    public static Display$DisplayParams$Builder newBuilder() {
        return (Display$DisplayParams$Builder)Display$DisplayParams.DEFAULT_INSTANCE.createBuilder();
    }
    
    private void setBottomBezelHeight(final float bottomBezelHeight_) {
        this.bitField0_ |= 0x4;
        this.bottomBezelHeight_ = bottomBezelHeight_;
    }
    
    private void setXPpi(final float xPpi_) {
        this.bitField0_ |= 0x1;
        this.xPpi_ = xPpi_;
    }
    
    private void setYPpi(final float yPpi_) {
        this.bitField0_ |= 0x2;
        this.yPpi_ = yPpi_;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Display$DisplayParams.PARSER) == null) {
                    synchronized (Display$DisplayParams.class) {
                        if (Display$DisplayParams.PARSER == null) {
                            Display$DisplayParams.PARSER = (ahdd)new ahba((ahbh)Display$DisplayParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Display$DisplayParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Display$DisplayParams$Builder(null);
            }
            case 3: {
                return new Display$DisplayParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)Display$DisplayParams.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004$", new Object[] { "bitField0_", "xPpi_", "yPpi_", "bottomBezelHeight_", "dEPRECATEDGyroBias_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public float getBottomBezelHeight() {
        return this.bottomBezelHeight_;
    }
    
    public float getXPpi() {
        return this.xPpi_;
    }
    
    public float getYPpi() {
        return this.yPpi_;
    }
    
    public boolean hasBottomBezelHeight() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public boolean hasXPpi() {
        return (this.bitField0_ & 0x1) != 0x0;
    }
    
    public boolean hasYPpi() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
}
