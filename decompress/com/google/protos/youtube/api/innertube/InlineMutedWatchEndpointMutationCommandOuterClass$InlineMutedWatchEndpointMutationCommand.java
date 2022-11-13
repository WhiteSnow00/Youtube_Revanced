// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand extends ahbh implements ahcw
{
    public static final InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand a;
    private static volatile ahdd d;
    public static final ahbf inlineMutedWatchEndpointMutationCommand;
    public aiqj b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand a2 = new InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand();
        ahbh.registerDefaultInstance((Class)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class, (ahbh)(a = a2));
        inlineMutedWatchEndpointMutationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 200453700, ahek.k, (Class)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class);
    }
    
    private InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.d) == null) {
                    synchronized (InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class) {
                        if (InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.d == null) {
                            InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.d = (ahdd)new ahba((ahbh)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a);
            }
            case 3: {
                return new InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
