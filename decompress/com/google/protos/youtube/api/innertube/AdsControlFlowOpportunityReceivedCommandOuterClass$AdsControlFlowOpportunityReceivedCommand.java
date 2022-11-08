// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand extends agzi implements ahax
{
    public static final AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand a;
    public static final agzg adsControlFlowOpportunityReceivedCommand;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public agzy d;
    public boolean e;
    private int g;
    
    static {
        final AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand a2 = new AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand();
        agzi.registerDefaultInstance((Class)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class, (agzi)(a = a2));
        adsControlFlowOpportunityReceivedCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 350496818, ahcm.k, (Class)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class);
    }
    
    private AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand() {
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.f) == null) {
                    synchronized (AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class) {
                        if (AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.f == null) {
                            AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.f = (ahbe)new agzb((agzi)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a;
            }
            case 4: {
                return new agza((agzi)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a);
            }
            case 3: {
                return new AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001\u100c\u0000\u0004\u001b\u0005\u1007\u0001\u0006\u001b", new Object[] { "g", "b", ahng.a, "c", ahlg.class, "e", "d", ahor.class });
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
