// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSystemToastActionOuterClass$ShowSystemToastAction extends agzi implements ahax
{
    public static final ShowSystemToastActionOuterClass$ShowSystemToastAction a;
    private static volatile ahbe d;
    public static final agzg showSystemToastAction;
    public int b;
    public ajsq c;
    private byte e;
    
    static {
        final ShowSystemToastActionOuterClass$ShowSystemToastAction a2 = new ShowSystemToastActionOuterClass$ShowSystemToastAction();
        agzi.registerDefaultInstance((Class)ShowSystemToastActionOuterClass$ShowSystemToastAction.class, (agzi)(a = a2));
        showSystemToastAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 173351111, ahcm.k, (Class)ShowSystemToastActionOuterClass$ShowSystemToastAction.class);
    }
    
    private ShowSystemToastActionOuterClass$ShowSystemToastAction() {
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
                if ((d = ShowSystemToastActionOuterClass$ShowSystemToastAction.d) == null) {
                    synchronized (ShowSystemToastActionOuterClass$ShowSystemToastAction.class) {
                        if (ShowSystemToastActionOuterClass$ShowSystemToastAction.d == null) {
                            ShowSystemToastActionOuterClass$ShowSystemToastAction.d = (ahbe)new agzb((agzi)ShowSystemToastActionOuterClass$ShowSystemToastAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowSystemToastActionOuterClass$ShowSystemToastAction.a;
            }
            case 4: {
                return new agza((agzi)ShowSystemToastActionOuterClass$ShowSystemToastAction.a);
            }
            case 3: {
                return new ShowSystemToastActionOuterClass$ShowSystemToastAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSystemToastActionOuterClass$ShowSystemToastAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
