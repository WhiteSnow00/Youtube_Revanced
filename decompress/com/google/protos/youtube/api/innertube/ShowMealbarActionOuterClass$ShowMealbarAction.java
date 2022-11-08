// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowMealbarActionOuterClass$ShowMealbarAction extends agzi implements ahax
{
    public static final ShowMealbarActionOuterClass$ShowMealbarAction a;
    private static volatile ahbe c;
    public static final agzg showMealbarAction;
    public aoel b;
    private int d;
    private byte e;
    
    static {
        final ShowMealbarActionOuterClass$ShowMealbarAction a2 = new ShowMealbarActionOuterClass$ShowMealbarAction();
        agzi.registerDefaultInstance((Class)ShowMealbarActionOuterClass$ShowMealbarAction.class, (agzi)(a = a2));
        showMealbarAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 109865460, ahcm.k, (Class)ShowMealbarActionOuterClass$ShowMealbarAction.class);
    }
    
    private ShowMealbarActionOuterClass$ShowMealbarAction() {
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
                final ahbe c;
                if ((c = ShowMealbarActionOuterClass$ShowMealbarAction.c) == null) {
                    synchronized (ShowMealbarActionOuterClass$ShowMealbarAction.class) {
                        if (ShowMealbarActionOuterClass$ShowMealbarAction.c == null) {
                            ShowMealbarActionOuterClass$ShowMealbarAction.c = (ahbe)new agzb((agzi)ShowMealbarActionOuterClass$ShowMealbarAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowMealbarActionOuterClass$ShowMealbarAction.a;
            }
            case 4: {
                return new agza((agzi)ShowMealbarActionOuterClass$ShowMealbarAction.a);
            }
            case 3: {
                return new ShowMealbarActionOuterClass$ShowMealbarAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowMealbarActionOuterClass$ShowMealbarAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
