// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand extends agzi implements ahax
{
    public static final EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand a;
    private static volatile ahbe b;
    public static final agzg enableCinematicLightingCommand;
    
    static {
        final EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand a2 = new EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand();
        agzi.registerDefaultInstance((Class)EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.class, (agzi)(a = a2));
        enableCinematicLightingCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 456628505, ahcm.k, (Class)EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.class);
    }
    
    private EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.b) == null) {
                    synchronized (EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.class) {
                        if (EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.b == null) {
                            EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.b = (ahbe)new agzb((agzi)EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.a;
            }
            case 4: {
                return new agza((agzi)EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.a);
            }
            case 3: {
                return new EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.a, "\u0001\u0000", (Object[])null);
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
