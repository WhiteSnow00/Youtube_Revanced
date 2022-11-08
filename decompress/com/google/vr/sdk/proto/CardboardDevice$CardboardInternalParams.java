// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class CardboardDevice$CardboardInternalParams extends agzi implements ahax
{
    public static final int ACCELEROMETER_FIELD_NUMBER = 5;
    private static final CardboardDevice$CardboardInternalParams DEFAULT_INSTANCE;
    public static final int EYE_ORIENTATIONS_FIELD_NUMBER = 1;
    public static final int GYROSCOPE_FIELD_NUMBER = 6;
    private static volatile ahbe PARSER;
    public static final int SCREEN_CENTER_TO_LENS_DISTANCE_FIELD_NUMBER = 2;
    public static final int X_PPI_OVERRIDE_FIELD_NUMBER = 3;
    public static final int Y_PPI_OVERRIDE_FIELD_NUMBER = 4;
    private static final agzr eyeOrientations_converter_;
    private String accelerometer_;
    private int bitField0_;
    private int eyeOrientationsMemoizedSerializedSize;
    private agzq eyeOrientations_;
    private String gyroscope_;
    private float screenCenterToLensDistance_;
    private float xPpiOverride_;
    private float yPpiOverride_;
    
    static {
        eyeOrientations_converter_ = new CardboardDevice$CardboardInternalParams$1();
        agzi.registerDefaultInstance((Class)CardboardDevice$CardboardInternalParams.class, (agzi)(DEFAULT_INSTANCE = new CardboardDevice$CardboardInternalParams()));
    }
    
    private CardboardDevice$CardboardInternalParams() {
        this.eyeOrientations_ = emptyIntList();
        this.accelerometer_ = "";
        this.gyroscope_ = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = CardboardDevice$CardboardInternalParams.PARSER) == null) {
                    synchronized (CardboardDevice$CardboardInternalParams.class) {
                        if (CardboardDevice$CardboardInternalParams.PARSER == null) {
                            CardboardDevice$CardboardInternalParams.PARSER = (ahbe)new agzb((agzi)CardboardDevice$CardboardInternalParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$CardboardInternalParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$CardboardInternalParams$Builder(null);
            }
            case 3: {
                return new CardboardDevice$CardboardInternalParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$CardboardInternalParams.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001,\u0002\u1001\u0000\u0003\u1001\u0001\u0004\u1001\u0002\u0005\u1008\u0003\u0006\u1008\u0004", new Object[] { "bitField0_", "eyeOrientations_", CardboardDevice$CardboardInternalParams$OrientationType.internalGetVerifier(), "screenCenterToLensDistance_", "xPpiOverride_", "yPpiOverride_", "accelerometer_", "gyroscope_" });
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
