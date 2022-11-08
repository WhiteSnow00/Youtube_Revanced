// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand extends agzi implements ahax
{
    public static final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand a;
    private static volatile ahbe d;
    public static final agzg localWatchHistoryCommand;
    public int b;
    public String c;
    private int e;
    
    static {
        final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand a2 = new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
        agzi.registerDefaultInstance((Class)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class, (agzi)(a = a2));
        localWatchHistoryCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 246157926, ahcm.k, (Class)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class);
    }
    
    private LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.d) == null) {
                    synchronized (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class) {
                        if (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.d == null) {
                            LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.d = (ahbe)new agzb((agzi)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a;
            }
            case 4: {
                return new agza((agzi)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a);
            }
            case 3: {
                return new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "e", "b", alsb.f, "c" });
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
