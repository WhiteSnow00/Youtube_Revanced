// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand extends agzi implements ahax
{
    public static final GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand a;
    private static volatile ahbe d;
    public static final agzg getWatchNextQueueAddCommand;
    public String b;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        final GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand a2 = new GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand();
        agzi.registerDefaultInstance((Class)GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.class, (agzi)(a = a2));
        getWatchNextQueueAddCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 465666947, ahcm.k, (Class)GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.class);
    }
    
    private GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand() {
        this.f = 2;
        this.b = "";
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
                final ahbe d;
                if ((d = GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.d) == null) {
                    synchronized (GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.class) {
                        if (GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.d == null) {
                            GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.d = (ahbe)new agzb((agzi)GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.a;
            }
            case 4: {
                return new agza((agzi)GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.a);
            }
            case 3: {
                return new GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
