// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand extends agzi implements ahax
{
    public static final EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand a;
    private static volatile ahbe b;
    public static final agzg enableSingleVideoPlaybackLoopCommand;
    
    static {
        final EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand a2 = new EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand();
        agzi.registerDefaultInstance((Class)EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.class, (agzi)(a = a2));
        enableSingleVideoPlaybackLoopCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 359423882, ahcm.k, (Class)EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.class);
    }
    
    private EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.b) == null) {
                    synchronized (EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.class) {
                        if (EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.b == null) {
                            EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.b = (ahbe)new agzb((agzi)EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.a;
            }
            case 4: {
                return new agza((agzi)EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.a);
            }
            case 3: {
                return new EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.a, "\u0001\u0000", (Object[])null);
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
