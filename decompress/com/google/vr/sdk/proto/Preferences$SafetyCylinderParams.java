// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$SafetyCylinderParams extends ahbh implements ahcw
{
    public static final int ANCHOR_WARNING_DISTANCE_FIELD_NUMBER = 8;
    public static final int COLLISION_SPHERE_RADIUS_FIELD_NUMBER = 1;
    private static final Preferences$SafetyCylinderParams DEFAULT_INSTANCE;
    public static final int ENTER_EVENT_RADIUS_FIELD_NUMBER = 6;
    public static final int EXIT_EVENT_RADIUS_FIELD_NUMBER = 7;
    public static final int GRAPHICS_ENABLED_FIELD_NUMBER = 9;
    public static final int INNER_FOG_COLOR_FIELD_NUMBER = 4;
    public static final int INNER_RADIUS_FIELD_NUMBER = 2;
    public static final int OUTER_FOG_COLOR_FIELD_NUMBER = 5;
    public static final int OUTER_RADIUS_FIELD_NUMBER = 3;
    private static volatile ahdd PARSER;
    private float anchorWarningDistance_;
    private int bitField0_;
    private float collisionSphereRadius_;
    private float enterEventRadius_;
    private float exitEventRadius_;
    private boolean graphicsEnabled_;
    private ahbo innerFogColor_;
    private float innerRadius_;
    private ahbo outerFogColor_;
    private float outerRadius_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$SafetyCylinderParams.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$SafetyCylinderParams()));
    }
    
    private Preferences$SafetyCylinderParams() {
        this.innerFogColor_ = emptyFloatList();
        this.outerFogColor_ = emptyFloatList();
        this.graphicsEnabled_ = true;
    }
    
    static Preferences$SafetyCylinderParams access$5200() {
        return Preferences$SafetyCylinderParams.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$SafetyCylinderParams.PARSER) == null) {
                    synchronized (Preferences$SafetyCylinderParams.class) {
                        if (Preferences$SafetyCylinderParams.PARSER == null) {
                            Preferences$SafetyCylinderParams.PARSER = (ahdd)new ahba((ahbh)Preferences$SafetyCylinderParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$SafetyCylinderParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$SafetyCylinderParams$Builder(null);
            }
            case 3: {
                return new Preferences$SafetyCylinderParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)Preferences$SafetyCylinderParams.DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u0013\u0005\u0013\u0006\u1001\u0003\u0007\u1001\u0004\b\u1001\u0005\t\u1007\u0006", new Object[] { "bitField0_", "collisionSphereRadius_", "innerRadius_", "outerRadius_", "innerFogColor_", "outerFogColor_", "enterEventRadius_", "exitEventRadius_", "anchorWarningDistance_", "graphicsEnabled_" });
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
