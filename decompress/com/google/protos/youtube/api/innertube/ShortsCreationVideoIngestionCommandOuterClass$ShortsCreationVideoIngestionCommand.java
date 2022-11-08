// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand extends agzi implements ahax
{
    public static final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand a;
    private static volatile ahbe l;
    public static final agzg shortsCreationVideoIngestionCommand;
    public int b;
    public int c;
    public int d;
    public String e;
    public agzy f;
    public aock g;
    public long h;
    public ajsj i;
    public ajsj j;
    public String k;
    private anss m;
    private byte n;
    
    static {
        final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand a2 = new ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand();
        agzi.registerDefaultInstance((Class)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.class, (agzi)(a = a2));
        shortsCreationVideoIngestionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 410389781, ahcm.k, (Class)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.class);
    }
    
    private ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand() {
        this.n = 2;
        this.e = "";
        this.f = emptyProtobufList();
        emptyProtobufList();
        this.k = "";
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
                final ahbe l;
                if ((l = ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.l) == null) {
                    synchronized (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.class) {
                        if (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.l == null) {
                            ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.l = (ahbe)new agzb((agzi)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.a;
            }
            case 4: {
                return new agza((char[][][])null, (byte[][][])null);
            }
            case 3: {
                return new ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0003\u0001\u1004\u0000\u0002\u100c\u0001\u0004\u1008\u0003\u0005\u001b\u0006\u1009\u0004\b\u1002\u0005\t\u1409\u0006\n\u1409\u0007\u000b\u1008\b\f\u1409\t", new Object[] { "b", "c", "d", aocr.c, "e", "f", aocy.class, "g", "h", "i", "j", "k", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
