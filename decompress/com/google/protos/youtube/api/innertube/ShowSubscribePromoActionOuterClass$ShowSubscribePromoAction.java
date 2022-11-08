// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction extends agzi implements ahax
{
    public static final ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction a;
    private static volatile ahbe c;
    public static final agzg showSubscribePromoAction;
    public String b;
    private int d;
    
    static {
        final ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction a2 = new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
        agzi.registerDefaultInstance((Class)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class, (agzi)(a = a2));
        showSubscribePromoAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 147359084, ahcm.k, (Class)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class);
    }
    
    private ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.c) == null) {
                    synchronized (ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class) {
                        if (ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.c == null) {
                            ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.c = (ahbe)new agzb((agzi)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a;
            }
            case 4: {
                return new agza((agzi)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a);
            }
            case 3: {
                return new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "d", "b" });
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
