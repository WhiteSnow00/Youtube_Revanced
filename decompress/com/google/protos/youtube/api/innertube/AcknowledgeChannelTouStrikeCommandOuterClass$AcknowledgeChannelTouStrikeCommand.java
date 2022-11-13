// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand extends ahbh implements ahcw
{
    public static final AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand a;
    public static final ahbf acknowledgeChannelTouStrikeCommand;
    private static volatile ahdd c;
    public aikc b;
    private int d;
    
    static {
        final AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand a2 = new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
        ahbh.registerDefaultInstance((Class)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class, (ahbh)(a = a2));
        acknowledgeChannelTouStrikeCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 230421059, ahek.k, (Class)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class);
    }
    
    private AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.c) == null) {
                    synchronized (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class) {
                        if (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.c == null) {
                            AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.c = (ahdd)new ahba((ahbh)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.a);
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
