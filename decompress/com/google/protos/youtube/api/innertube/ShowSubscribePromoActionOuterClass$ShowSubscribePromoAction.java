// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction extends ahbh implements ahcw
{
    public static final ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction a;
    private static volatile ahdd c;
    public static final ahbf showSubscribePromoAction;
    public String b;
    private int d;
    
    static {
        final ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction a2 = new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
        ahbh.registerDefaultInstance((Class)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class, (ahbh)(a = a2));
        showSubscribePromoAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 147359084, ahek.k, (Class)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class);
    }
    
    private ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.c) == null) {
                    synchronized (ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class) {
                        if (ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.c == null) {
                            ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.c = (ahdd)new ahba((ahbh)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.a);
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
