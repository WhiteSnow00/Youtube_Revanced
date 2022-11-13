// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand extends ahbh implements ahcw
{
    public static final KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand a;
    private static volatile ahdd b;
    public static final ahbf kickOtherParticipantCommand;
    
    static {
        final KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand a2 = new KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand();
        ahbh.registerDefaultInstance((Class)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.class, (ahbh)(a = a2));
        kickOtherParticipantCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 439221000, ahek.k, (Class)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.class);
    }
    
    private KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.b) == null) {
                    synchronized (KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.class) {
                        if (KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.b == null) {
                            KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.b = (ahdd)new ahba((ahbh)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a);
            }
            case 3: {
                return new KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a, "\u0001\u0000", (Object[])null);
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
