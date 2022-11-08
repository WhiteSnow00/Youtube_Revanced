// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddToToastActionOuterClass$AddToToastAction extends agzi implements ahax
{
    public static final AddToToastActionOuterClass$AddToToastAction a;
    public static final agzg addToToastAction;
    private static volatile ahbe d;
    public int b;
    public ahmy c;
    private byte e;
    
    static {
        final AddToToastActionOuterClass$AddToToastAction a2 = new AddToToastActionOuterClass$AddToToastAction();
        agzi.registerDefaultInstance((Class)AddToToastActionOuterClass$AddToToastAction.class, (agzi)(a = a2));
        addToToastAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 76623563, ahcm.k, (Class)AddToToastActionOuterClass$AddToToastAction.class);
    }
    
    private AddToToastActionOuterClass$AddToToastAction() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = AddToToastActionOuterClass$AddToToastAction.d) == null) {
                    synchronized (AddToToastActionOuterClass$AddToToastAction.class) {
                        if (AddToToastActionOuterClass$AddToToastAction.d == null) {
                            AddToToastActionOuterClass$AddToToastAction.d = (ahbe)new agzb((agzi)AddToToastActionOuterClass$AddToToastAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AddToToastActionOuterClass$AddToToastAction.a;
            }
            case 4: {
                return new agza((agzi)AddToToastActionOuterClass$AddToToastAction.a);
            }
            case 3: {
                return new AddToToastActionOuterClass$AddToToastAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddToToastActionOuterClass$AddToToastAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
