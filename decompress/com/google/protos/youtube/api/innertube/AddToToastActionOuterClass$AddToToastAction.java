// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddToToastActionOuterClass$AddToToastAction extends ahbh implements ahcw
{
    public static final AddToToastActionOuterClass$AddToToastAction a;
    public static final ahbf addToToastAction;
    private static volatile ahdd d;
    public int b;
    public ahow c;
    private byte e;
    
    static {
        final AddToToastActionOuterClass$AddToToastAction a2 = new AddToToastActionOuterClass$AddToToastAction();
        ahbh.registerDefaultInstance((Class)AddToToastActionOuterClass$AddToToastAction.class, (ahbh)(a = a2));
        addToToastAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 76623563, ahek.k, (Class)AddToToastActionOuterClass$AddToToastAction.class);
    }
    
    private AddToToastActionOuterClass$AddToToastAction() {
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
                if ((d = AddToToastActionOuterClass$AddToToastAction.d) == null) {
                    synchronized (AddToToastActionOuterClass$AddToToastAction.class) {
                        if (AddToToastActionOuterClass$AddToToastAction.d == null) {
                            AddToToastActionOuterClass$AddToToastAction.d = (ahdd)new ahba((ahbh)AddToToastActionOuterClass$AddToToastAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AddToToastActionOuterClass$AddToToastAction.a;
            }
            case 4: {
                return new ahaz((ahbh)AddToToastActionOuterClass$AddToToastAction.a);
            }
            case 3: {
                return new AddToToastActionOuterClass$AddToToastAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddToToastActionOuterClass$AddToToastAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
