// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowInterstitialActionOuterClass$ShowInterstitialAction extends agzi implements ahax
{
    public static final ShowInterstitialActionOuterClass$ShowInterstitialAction a;
    private static volatile ahbe d;
    public static final agzg showInterstitialAction;
    public aoej b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final ShowInterstitialActionOuterClass$ShowInterstitialAction a2 = new ShowInterstitialActionOuterClass$ShowInterstitialAction();
        agzi.registerDefaultInstance((Class)ShowInterstitialActionOuterClass$ShowInterstitialAction.class, (agzi)(a = a2));
        showInterstitialAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 152165632, ahcm.k, (Class)ShowInterstitialActionOuterClass$ShowInterstitialAction.class);
    }
    
    private ShowInterstitialActionOuterClass$ShowInterstitialAction() {
        this.f = 2;
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
                if ((d = ShowInterstitialActionOuterClass$ShowInterstitialAction.d) == null) {
                    synchronized (ShowInterstitialActionOuterClass$ShowInterstitialAction.class) {
                        if (ShowInterstitialActionOuterClass$ShowInterstitialAction.d == null) {
                            ShowInterstitialActionOuterClass$ShowInterstitialAction.d = (ahbe)new agzb((agzi)ShowInterstitialActionOuterClass$ShowInterstitialAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowInterstitialActionOuterClass$ShowInterstitialAction.a;
            }
            case 4: {
                return new agza((agzi)ShowInterstitialActionOuterClass$ShowInterstitialAction.a);
            }
            case 3: {
                return new ShowInterstitialActionOuterClass$ShowInterstitialAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowInterstitialActionOuterClass$ShowInterstitialAction.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1007\u0002", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
