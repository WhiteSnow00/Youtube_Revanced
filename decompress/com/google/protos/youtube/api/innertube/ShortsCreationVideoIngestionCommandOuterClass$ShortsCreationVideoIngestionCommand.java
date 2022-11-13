// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand extends ahbh implements ahcw
{
    public static final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand a;
    private static volatile ahdd l;
    public static final ahbf shortsCreationVideoIngestionCommand;
    public int b;
    public int c;
    public int d;
    public String e;
    public ahbx f;
    public aoem g;
    public long h;
    public ajum i;
    public ajum j;
    public String k;
    private anuv m;
    private byte n;
    
    static {
        final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand a2 = new ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand();
        ahbh.registerDefaultInstance((Class)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.class, (ahbh)(a = a2));
        shortsCreationVideoIngestionCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 410389781, ahek.k, (Class)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.class);
    }
    
    private ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand() {
        this.n = 2;
        this.e = "";
        this.f = emptyProtobufList();
        emptyProtobufList();
        this.k = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.l) == null) {
                    synchronized (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.class) {
                        if (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.l == null) {
                            ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.l = (ahdd)new ahba((ahbh)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.a;
            }
            case 4: {
                return new ahaz((int[][])null, (char[][])null);
            }
            case 3: {
                return new ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0003\u0001\u1004\u0000\u0002\u100c\u0001\u0004\u1008\u0003\u0005\u001b\u0006\u1009\u0004\b\u1002\u0005\t\u1409\u0006\n\u1409\u0007\u000b\u1008\b\f\u1409\t", new Object[] { "b", "c", "d", aoet.d, "e", "f", aofa.class, "g", "h", "i", "j", "k", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
