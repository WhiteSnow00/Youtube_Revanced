// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand extends agzi implements ahax
{
    public static final KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand a;
    private static volatile ahbe b;
    public static final agzg kickOtherParticipantCommand;
    
    static {
        final KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand a2 = new KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand();
        agzi.registerDefaultInstance((Class)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.class, (agzi)(a = a2));
        kickOtherParticipantCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 439221000, ahcm.k, (Class)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.class);
    }
    
    private KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.b) == null) {
                    synchronized (KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.class) {
                        if (KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.b == null) {
                            KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.b = (ahbe)new agzb((agzi)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a;
            }
            case 4: {
                return new agza((agzi)KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.a);
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
