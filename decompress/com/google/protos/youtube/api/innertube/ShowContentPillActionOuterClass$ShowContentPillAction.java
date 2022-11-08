// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowContentPillActionOuterClass$ShowContentPillAction extends agzi implements ahax
{
    public static final ShowContentPillActionOuterClass$ShowContentPillAction a;
    private static volatile ahbe d;
    public static final agzg showContentPillAction;
    public int b;
    public aodx c;
    private byte e;
    
    static {
        final ShowContentPillActionOuterClass$ShowContentPillAction a2 = new ShowContentPillActionOuterClass$ShowContentPillAction();
        agzi.registerDefaultInstance((Class)ShowContentPillActionOuterClass$ShowContentPillAction.class, (agzi)(a = a2));
        showContentPillAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 135486026, ahcm.k, (Class)ShowContentPillActionOuterClass$ShowContentPillAction.class);
    }
    
    private ShowContentPillActionOuterClass$ShowContentPillAction() {
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
                if ((d = ShowContentPillActionOuterClass$ShowContentPillAction.d) == null) {
                    synchronized (ShowContentPillActionOuterClass$ShowContentPillAction.class) {
                        if (ShowContentPillActionOuterClass$ShowContentPillAction.d == null) {
                            ShowContentPillActionOuterClass$ShowContentPillAction.d = (ahbe)new agzb((agzi)ShowContentPillActionOuterClass$ShowContentPillAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowContentPillActionOuterClass$ShowContentPillAction.a;
            }
            case 4: {
                return new agza((agzi)ShowContentPillActionOuterClass$ShowContentPillAction.a);
            }
            case 3: {
                return new ShowContentPillActionOuterClass$ShowContentPillAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowContentPillActionOuterClass$ShowContentPillAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
