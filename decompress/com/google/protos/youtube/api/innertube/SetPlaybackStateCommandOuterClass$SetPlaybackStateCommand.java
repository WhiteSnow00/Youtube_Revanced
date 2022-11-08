// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand extends agzi implements ahax
{
    public static final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand a;
    private static volatile ahbe d;
    public static final agzg setPlaybackStateCommand;
    public int b;
    public int c;
    
    static {
        final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand a2 = new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
        agzi.registerDefaultInstance((Class)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class, (agzi)(a = a2));
        setPlaybackStateCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 327511066, ahcm.k, (Class)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class);
    }
    
    private SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.d) == null) {
                    synchronized (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class) {
                        if (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.d == null) {
                            SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.d = (ahbe)new agzb((agzi)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a;
            }
            case 4: {
                return new agza((agzi)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a);
            }
            case 3: {
                return new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anvq.i });
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
