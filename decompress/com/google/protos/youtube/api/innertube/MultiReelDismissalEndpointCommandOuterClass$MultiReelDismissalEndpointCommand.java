// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand extends agzi implements ahax
{
    public static final MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand a;
    private static volatile ahbe c;
    public static final agzg multiReelDismissalEndpointCommand;
    public anss b;
    private int d;
    private byte e;
    
    static {
        final MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand a2 = new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
        agzi.registerDefaultInstance((Class)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class, (agzi)(a = a2));
        multiReelDismissalEndpointCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 187251317, ahcm.k, (Class)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class);
    }
    
    private MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand() {
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
                if ((c = MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.c) == null) {
                    synchronized (MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class) {
                        if (MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.c == null) {
                            MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.c = (ahbe)new agzb((agzi)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a;
            }
            case 4: {
                return new agza((agzi)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a);
            }
            case 3: {
                return new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
