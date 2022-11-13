// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand extends ahbh implements ahcw
{
    public static final MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand a;
    private static volatile ahdd c;
    public static final ahbf multiReelDismissalEndpointCommand;
    public anuv b;
    private int d;
    private byte e;
    
    static {
        final MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand a2 = new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
        ahbh.registerDefaultInstance((Class)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class, (ahbh)(a = a2));
        multiReelDismissalEndpointCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 187251317, ahek.k, (Class)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class);
    }
    
    private MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.c) == null) {
                    synchronized (MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class) {
                        if (MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.c == null) {
                            MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.c = (ahdd)new ahba((ahbh)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a);
            }
            case 3: {
                return new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
