// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand extends agzi implements ahax
{
    public static final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand a;
    private static volatile ahbe g;
    public static final agzg getShortsSourceVideoCommand;
    public int b;
    public String c;
    public String d;
    public aock e;
    public agzy f;
    
    static {
        final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand a2 = new GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand();
        agzi.registerDefaultInstance((Class)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.class, (agzi)(a = a2));
        getShortsSourceVideoCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 359870813, ahcm.k, (Class)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.class);
    }
    
    private GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand() {
        this.c = "";
        this.d = "";
        this.f = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.g) == null) {
                    synchronized (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.class) {
                        if (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.g == null) {
                            GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.g = (ahbe)new agzb((agzi)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.a;
            }
            case 4: {
                return new agza((float[][])null, (short[])null);
            }
            case 3: {
                return new GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u001b", new Object[] { "b", "c", "d", "e", "f", aods.class });
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
