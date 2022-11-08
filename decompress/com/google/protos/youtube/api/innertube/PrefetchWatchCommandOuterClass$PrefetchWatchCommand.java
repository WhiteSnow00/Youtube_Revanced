// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PrefetchWatchCommandOuterClass$PrefetchWatchCommand extends agzi implements ahax
{
    public static final PrefetchWatchCommandOuterClass$PrefetchWatchCommand a;
    private static volatile ahbe n;
    public static final agzg prefetchWatchCommand;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public amvn h;
    public apqa i;
    public agyc j;
    public anbi k;
    public float l;
    public anao m;
    
    static {
        final PrefetchWatchCommandOuterClass$PrefetchWatchCommand a2 = new PrefetchWatchCommandOuterClass$PrefetchWatchCommand();
        agzi.registerDefaultInstance((Class)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.class, (agzi)(a = a2));
        prefetchWatchCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 387205844, ahcm.k, (Class)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.class);
    }
    
    private PrefetchWatchCommandOuterClass$PrefetchWatchCommand() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = "";
        this.j = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe n;
                if ((n = PrefetchWatchCommandOuterClass$PrefetchWatchCommand.n) == null) {
                    synchronized (PrefetchWatchCommandOuterClass$PrefetchWatchCommand.class) {
                        if (PrefetchWatchCommandOuterClass$PrefetchWatchCommand.n == null) {
                            PrefetchWatchCommandOuterClass$PrefetchWatchCommand.n = (ahbe)new agzb((agzi)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a;
            }
            case 4: {
                return new agza((agzi)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a);
            }
            case 3: {
                return new PrefetchWatchCommandOuterClass$PrefetchWatchCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PrefetchWatchCommandOuterClass$PrefetchWatchCommand.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u100b\u0003\u0005\u1008\u0004\u0006\u1009\u0005\u0007\u1009\u0006\b\u1009\b\t\u1001\t\n\u1009\u000b\u000b\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "j" });
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
