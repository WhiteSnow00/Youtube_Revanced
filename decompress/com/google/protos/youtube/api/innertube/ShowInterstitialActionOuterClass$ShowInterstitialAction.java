// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowInterstitialActionOuterClass$ShowInterstitialAction extends ahbh implements ahcw
{
    public static final ShowInterstitialActionOuterClass$ShowInterstitialAction a;
    private static volatile ahdd d;
    public static final ahbf showInterstitialAction;
    public aogm b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final ShowInterstitialActionOuterClass$ShowInterstitialAction a2 = new ShowInterstitialActionOuterClass$ShowInterstitialAction();
        ahbh.registerDefaultInstance((Class)ShowInterstitialActionOuterClass$ShowInterstitialAction.class, (ahbh)(a = a2));
        showInterstitialAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 152165632, ahek.k, (Class)ShowInterstitialActionOuterClass$ShowInterstitialAction.class);
    }
    
    private ShowInterstitialActionOuterClass$ShowInterstitialAction() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ShowInterstitialActionOuterClass$ShowInterstitialAction.d) == null) {
                    synchronized (ShowInterstitialActionOuterClass$ShowInterstitialAction.class) {
                        if (ShowInterstitialActionOuterClass$ShowInterstitialAction.d == null) {
                            ShowInterstitialActionOuterClass$ShowInterstitialAction.d = (ahdd)new ahba((ahbh)ShowInterstitialActionOuterClass$ShowInterstitialAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowInterstitialActionOuterClass$ShowInterstitialAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowInterstitialActionOuterClass$ShowInterstitialAction.a);
            }
            case 3: {
                return new ShowInterstitialActionOuterClass$ShowInterstitialAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowInterstitialActionOuterClass$ShowInterstitialAction.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1007\u0002", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
