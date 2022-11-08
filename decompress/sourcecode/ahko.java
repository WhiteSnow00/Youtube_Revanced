import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahko extends agzi implements ahax
{
    public static final ahko a;
    private static volatile ahbe h;
    public int b;
    public ahkp c;
    public ahkn d;
    public ahjl e;
    public ahlm f;
    public agyc g;
    private ahlm i;
    private ahfw j;
    private ahkt k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)ahko.class, (agzi)(a = new ahko()));
    }
    
    private ahko() {
        this.l = 2;
        this.g = agyc.b;
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
                final ahbe h;
                if ((h = ahko.h) == null) {
                    synchronized (ahko.class) {
                        if (ahko.h == null) {
                            ahko.h = (ahbe)new agzb((agzi)ahko.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahko.a;
            }
            case 4: {
                return new agza((agzi)ahko.a);
            }
            case 3: {
                return new ahko();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahko.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0007\u0006\u100a\b\u0007\u1409\u0002\b\u1409\u0004\n\u1409\t", new Object[] { "b", "c", "i", "e", "j", "g", "d", "f", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
