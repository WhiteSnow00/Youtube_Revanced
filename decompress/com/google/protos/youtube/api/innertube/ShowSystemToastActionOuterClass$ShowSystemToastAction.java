// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSystemToastActionOuterClass$ShowSystemToastAction extends ahbh implements ahcw
{
    public static final ShowSystemToastActionOuterClass$ShowSystemToastAction a;
    private static volatile ahdd d;
    public static final ahbf showSystemToastAction;
    public int b;
    public ajut c;
    private byte e;
    
    static {
        final ShowSystemToastActionOuterClass$ShowSystemToastAction a2 = new ShowSystemToastActionOuterClass$ShowSystemToastAction();
        ahbh.registerDefaultInstance((Class)ShowSystemToastActionOuterClass$ShowSystemToastAction.class, (ahbh)(a = a2));
        showSystemToastAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 173351111, ahek.k, (Class)ShowSystemToastActionOuterClass$ShowSystemToastAction.class);
    }
    
    private ShowSystemToastActionOuterClass$ShowSystemToastAction() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ShowSystemToastActionOuterClass$ShowSystemToastAction.d) == null) {
                    synchronized (ShowSystemToastActionOuterClass$ShowSystemToastAction.class) {
                        if (ShowSystemToastActionOuterClass$ShowSystemToastAction.d == null) {
                            ShowSystemToastActionOuterClass$ShowSystemToastAction.d = (ahdd)new ahba((ahbh)ShowSystemToastActionOuterClass$ShowSystemToastAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowSystemToastActionOuterClass$ShowSystemToastAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowSystemToastActionOuterClass$ShowSystemToastAction.a);
            }
            case 3: {
                return new ShowSystemToastActionOuterClass$ShowSystemToastAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSystemToastActionOuterClass$ShowSystemToastAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
