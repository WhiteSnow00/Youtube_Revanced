// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand extends agzi implements ahax
{
    public static final WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand a;
    private static volatile ahbe c;
    public static final agzg watchNextWatchEndpointMutationCommand;
    public aioe b;
    private int d;
    private byte e;
    
    static {
        final WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand a2 = new WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand();
        agzi.registerDefaultInstance((Class)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.class, (agzi)(a = a2));
        watchNextWatchEndpointMutationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 267704595, ahcm.k, (Class)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.class);
    }
    
    private WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.c) == null) {
                    synchronized (WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.class) {
                        if (WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.c == null) {
                            WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.c = (ahbe)new agzb((agzi)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.a;
            }
            case 4: {
                return new agza((agzi)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.a);
            }
            case 3: {
                return new WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
