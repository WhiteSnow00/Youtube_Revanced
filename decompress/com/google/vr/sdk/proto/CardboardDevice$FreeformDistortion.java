// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class CardboardDevice$FreeformDistortion extends agzi implements ahax
{
    public static final int BLUE_VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 9;
    private static final CardboardDevice$FreeformDistortion DEFAULT_INSTANCE;
    public static final int EYE_TAN_ANGLE_MAX_X_FIELD_NUMBER = 4;
    public static final int EYE_TAN_ANGLE_MAX_Y_FIELD_NUMBER = 6;
    public static final int EYE_TAN_ANGLE_MIN_X_FIELD_NUMBER = 3;
    public static final int EYE_TAN_ANGLE_MIN_Y_FIELD_NUMBER = 5;
    public static final int GREEN_VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 8;
    private static volatile ahbe PARSER;
    public static final int RESOLUTION_X_FIELD_NUMBER = 1;
    public static final int RESOLUTION_Y_FIELD_NUMBER = 2;
    public static final int VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 7;
    private int bitField0_;
    private agzp blueVirtualEyeTanAngle_;
    private float eyeTanAngleMaxX_;
    private float eyeTanAngleMaxY_;
    private float eyeTanAngleMinX_;
    private float eyeTanAngleMinY_;
    private agzp greenVirtualEyeTanAngle_;
    private int resolutionX_;
    private int resolutionY_;
    private agzp virtualEyeTanAngle_;
    
    static {
        agzi.registerDefaultInstance((Class)CardboardDevice$FreeformDistortion.class, (agzi)(DEFAULT_INSTANCE = new CardboardDevice$FreeformDistortion()));
    }
    
    private CardboardDevice$FreeformDistortion() {
        this.virtualEyeTanAngle_ = emptyFloatList();
        this.greenVirtualEyeTanAngle_ = emptyFloatList();
        this.blueVirtualEyeTanAngle_ = emptyFloatList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = CardboardDevice$FreeformDistortion.PARSER) == null) {
                    synchronized (CardboardDevice$FreeformDistortion.class) {
                        if (CardboardDevice$FreeformDistortion.PARSER == null) {
                            CardboardDevice$FreeformDistortion.PARSER = (ahbe)new agzb((agzi)CardboardDevice$FreeformDistortion.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$FreeformDistortion.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$FreeformDistortion$Builder(null);
            }
            case 3: {
                return new CardboardDevice$FreeformDistortion();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$FreeformDistortion.DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u0013\b\u0013\t\u0013", new Object[] { "bitField0_", "resolutionX_", "resolutionY_", "eyeTanAngleMinX_", "eyeTanAngleMaxX_", "eyeTanAngleMinY_", "eyeTanAngleMaxY_", "virtualEyeTanAngle_", "greenVirtualEyeTanAngle_", "blueVirtualEyeTanAngle_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
