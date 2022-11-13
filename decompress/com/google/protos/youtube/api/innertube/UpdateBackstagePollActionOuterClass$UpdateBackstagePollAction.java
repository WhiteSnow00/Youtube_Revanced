// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction extends ahbh implements ahcw
{
    public static final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction a;
    private static volatile ahdd f;
    public static final ahbf updateBackstagePollAction;
    public int b;
    public int c;
    public ajut d;
    public int e;
    private byte g;
    
    static {
        final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction a2 = new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
        ahbh.registerDefaultInstance((Class)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class, (ahbh)(a = a2));
        updateBackstagePollAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 139609360, ahek.k, (Class)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class);
    }
    
    private UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.f) == null) {
                    synchronized (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class) {
                        if (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.f == null) {
                            UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.f = (ahdd)new ahba((ahbh)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a);
            }
            case 3: {
                return new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100c\u0001\u0002\u1409\u0002\u0003\u1004\u0003", new Object[] { "b", "c", airo.a(), "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
