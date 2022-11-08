// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand extends agzi implements ahax
{
    public static final LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand a;
    private static volatile ahbe c;
    public static final agzg lensWatchNextRequestContinuationCommand;
    public String b;
    private int d;
    
    static {
        final LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand a2 = new LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand();
        agzi.registerDefaultInstance((Class)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.class, (agzi)(a = a2));
        lensWatchNextRequestContinuationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 274848447, ahcm.k, (Class)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.class);
    }
    
    private LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.c) == null) {
                    synchronized (LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.class) {
                        if (LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.c == null) {
                            LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.c = (ahbe)new agzb((agzi)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a;
            }
            case 4: {
                return new agza((agzi)LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.a);
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
