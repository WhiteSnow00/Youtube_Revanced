// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand extends ahbh implements ahcw
{
    public static final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand a;
    private static volatile ahdd d;
    public static final ahbf localWatchHistoryCommand;
    public int b;
    public String c;
    private int e;
    
    static {
        final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand a2 = new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
        ahbh.registerDefaultInstance((Class)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class, (ahbh)(a = a2));
        localWatchHistoryCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 246157926, ahek.k, (Class)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class);
    }
    
    private LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.d) == null) {
                    synchronized (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class) {
                        if (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.d == null) {
                            LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.d = (ahdd)new ahba((ahbh)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a);
            }
            case 3: {
                return new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "e", "b", alua.g, "c" });
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
