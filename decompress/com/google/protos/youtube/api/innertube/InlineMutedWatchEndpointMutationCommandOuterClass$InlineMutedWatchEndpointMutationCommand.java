// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand extends agzi implements ahax
{
    public static final InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand a;
    private static volatile ahbe d;
    public static final agzg inlineMutedWatchEndpointMutationCommand;
    public aioe b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand a2 = new InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand();
        agzi.registerDefaultInstance((Class)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class, (agzi)(a = a2));
        inlineMutedWatchEndpointMutationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 200453700, ahcm.k, (Class)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class);
    }
    
    private InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand() {
        this.f = 2;
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
                final ahbe d;
                if ((d = InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.d) == null) {
                    synchronized (InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class) {
                        if (InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.d == null) {
                            InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.d = (ahbe)new agzb((agzi)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a;
            }
            case 4: {
                return new agza((agzi)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a);
            }
            case 3: {
                return new InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
