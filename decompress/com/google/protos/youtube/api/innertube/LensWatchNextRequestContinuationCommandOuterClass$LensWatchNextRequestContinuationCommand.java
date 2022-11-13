// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand extends ahbh implements ahcw
{
    public static final LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand a;
    private static volatile ahdd c;
    public static final ahbf lensWatchNextRequestContinuationCommand;
    public String b;
    private int d;
    
    static {
        final LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand a2 = new LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand();
        ahbh.registerDefaultInstance((Class)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.class, (ahbh)(a = a2));
        lensWatchNextRequestContinuationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 274848447, ahek.k, (Class)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.class);
    }
    
    private LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.c) == null) {
                    synchronized (LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.class) {
                        if (LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.c == null) {
                            LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.c = (ahdd)new ahba((ahbh)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a);
            }
            case 3: {
                return new LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
