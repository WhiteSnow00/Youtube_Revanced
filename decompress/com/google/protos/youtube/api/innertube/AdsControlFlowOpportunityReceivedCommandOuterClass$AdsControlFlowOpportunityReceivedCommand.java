// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand extends ahbh implements ahcw
{
    public static final AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand a;
    public static final ahbf adsControlFlowOpportunityReceivedCommand;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public ahbx d;
    public boolean e;
    private int g;
    
    static {
        final AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand a2 = new AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand();
        ahbh.registerDefaultInstance((Class)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class, (ahbh)(a = a2));
        adsControlFlowOpportunityReceivedCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 350496818, ahek.k, (Class)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class);
    }
    
    private AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand() {
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.f) == null) {
                    synchronized (AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class) {
                        if (AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.f == null) {
                            AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.f = (ahdd)new ahba((ahbh)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a);
            }
            case 3: {
                return new AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001\u100c\u0000\u0004\u001b\u0005\u1007\u0001\u0006\u001b", new Object[] { "g", "b", ahpe.a, "c", ahne.class, "e", "d", ahqp.class });
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
