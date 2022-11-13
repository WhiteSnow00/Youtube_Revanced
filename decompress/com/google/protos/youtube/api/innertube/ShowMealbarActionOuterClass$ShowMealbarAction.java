// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowMealbarActionOuterClass$ShowMealbarAction extends ahbh implements ahcw
{
    public static final ShowMealbarActionOuterClass$ShowMealbarAction a;
    private static volatile ahdd c;
    public static final ahbf showMealbarAction;
    public aogo b;
    private int d;
    private byte e;
    
    static {
        final ShowMealbarActionOuterClass$ShowMealbarAction a2 = new ShowMealbarActionOuterClass$ShowMealbarAction();
        ahbh.registerDefaultInstance((Class)ShowMealbarActionOuterClass$ShowMealbarAction.class, (ahbh)(a = a2));
        showMealbarAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 109865460, ahek.k, (Class)ShowMealbarActionOuterClass$ShowMealbarAction.class);
    }
    
    private ShowMealbarActionOuterClass$ShowMealbarAction() {
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
                final ahdd c;
                if ((c = ShowMealbarActionOuterClass$ShowMealbarAction.c) == null) {
                    synchronized (ShowMealbarActionOuterClass$ShowMealbarAction.class) {
                        if (ShowMealbarActionOuterClass$ShowMealbarAction.c == null) {
                            ShowMealbarActionOuterClass$ShowMealbarAction.c = (ahdd)new ahba((ahbh)ShowMealbarActionOuterClass$ShowMealbarAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowMealbarActionOuterClass$ShowMealbarAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowMealbarActionOuterClass$ShowMealbarAction.a);
            }
            case 3: {
                return new ShowMealbarActionOuterClass$ShowMealbarAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowMealbarActionOuterClass$ShowMealbarAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
