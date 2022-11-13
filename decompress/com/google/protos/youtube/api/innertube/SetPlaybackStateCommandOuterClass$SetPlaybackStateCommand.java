// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand extends ahbh implements ahcw
{
    public static final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand a;
    private static volatile ahdd d;
    public static final ahbf setPlaybackStateCommand;
    public int b;
    public int c;
    
    static {
        final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand a2 = new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
        ahbh.registerDefaultInstance((Class)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class, (ahbh)(a = a2));
        setPlaybackStateCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 327511066, ahek.k, (Class)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class);
    }
    
    private SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.d) == null) {
                    synchronized (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class) {
                        if (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.d == null) {
                            SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.d = (ahdd)new ahba((ahbh)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a);
            }
            case 3: {
                return new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anxd.j });
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
