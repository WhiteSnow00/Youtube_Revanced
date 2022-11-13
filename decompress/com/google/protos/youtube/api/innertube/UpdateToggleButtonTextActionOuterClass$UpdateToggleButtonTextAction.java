// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction extends ahbh implements ahcw
{
    public static final UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction a;
    private static volatile ahdd f;
    public static final ahbf updateToggleButtonTextAction;
    public int b;
    public ajut c;
    public ajut d;
    public int e;
    private byte g;
    
    static {
        final UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction a2 = new UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction();
        ahbh.registerDefaultInstance((Class)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class, (ahbh)(a = a2));
        updateToggleButtonTextAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 136527603, ahek.k, (Class)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class);
    }
    
    private UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction() {
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
                if ((f = UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.f) == null) {
                    synchronized (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class) {
                        if (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.f == null) {
                            UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.f = (ahdd)new ahba((ahbh)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.a);
            }
            case 3: {
                return new UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aopl.u });
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
