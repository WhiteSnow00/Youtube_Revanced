// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand extends agzi implements ahax
{
    public static final WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand a;
    private static volatile ahbe d;
    public static final agzg watchPlayerOverflowMenuCommand;
    public int b;
    public String c;
    
    static {
        final WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand a2 = new WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand();
        agzi.registerDefaultInstance((Class)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.class, (agzi)(a = a2));
        watchPlayerOverflowMenuCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 469660771, ahcm.k, (Class)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.class);
    }
    
    private WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand() {
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
                if ((d = WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.d) == null) {
                    synchronized (WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.class) {
                        if (WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.d == null) {
                            WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.d = (ahbe)new agzb((agzi)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.a;
            }
            case 4: {
                return new agza((agzi)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.a);
            }
            case 3: {
                return new WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
