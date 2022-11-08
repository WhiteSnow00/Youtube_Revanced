// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand extends agzi implements ahax
{
    public static final AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand a;
    public static final agzg acknowledgeChannelTouStrikeCommand;
    private static volatile ahbe c;
    public aiie b;
    private int d;
    
    static {
        final AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand a2 = new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
        agzi.registerDefaultInstance((Class)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class, (agzi)(a = a2));
        acknowledgeChannelTouStrikeCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 230421059, ahcm.k, (Class)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class);
    }
    
    private AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.c) == null) {
                    synchronized (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class) {
                        if (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.c == null) {
                            AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.c = (ahbe)new agzb((agzi)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a;
            }
            case 4: {
                return new agza((agzi)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a);
            }
            case 3: {
                return new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
