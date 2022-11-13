// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PrefetchWatchCommandOuterClass$PrefetchWatchCommand extends ahbh implements ahcw
{
    public static final PrefetchWatchCommandOuterClass$PrefetchWatchCommand a;
    private static volatile ahdd n;
    public static final ahbf prefetchWatchCommand;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public amxr h;
    public apse i;
    public ahab j;
    public andm k;
    public float l;
    public ancs m;
    
    static {
        final PrefetchWatchCommandOuterClass$PrefetchWatchCommand a2 = new PrefetchWatchCommandOuterClass$PrefetchWatchCommand();
        ahbh.registerDefaultInstance((Class)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.class, (ahbh)(a = a2));
        prefetchWatchCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 387205844, ahek.k, (Class)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.class);
    }
    
    private PrefetchWatchCommandOuterClass$PrefetchWatchCommand() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = "";
        this.j = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = PrefetchWatchCommandOuterClass$PrefetchWatchCommand.n) == null) {
                    synchronized (PrefetchWatchCommandOuterClass$PrefetchWatchCommand.class) {
                        if (PrefetchWatchCommandOuterClass$PrefetchWatchCommand.n == null) {
                            PrefetchWatchCommandOuterClass$PrefetchWatchCommand.n = (ahdd)new ahba((ahbh)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a);
            }
            case 3: {
                return new PrefetchWatchCommandOuterClass$PrefetchWatchCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u100b\u0003\u0005\u1008\u0004\u0006\u1009\u0006\u0007\u1009\u0007\b\u1009\t\t\u1001\n\n\u1009\f\u000b\u100a\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "j" });
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
