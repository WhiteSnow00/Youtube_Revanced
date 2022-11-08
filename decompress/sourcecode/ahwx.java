import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwx extends agzi implements ahax
{
    public static final ahwx a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aibc h;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private ajsq m;
    private ajsq n;
    private ajsq o;
    private ahwy p;
    private ajsq q;
    private aibc r;
    private ajsq s;
    private ahfw t;
    private byte u;
    
    static {
        agzi.registerDefaultInstance(ahwx.class, a = new ahwx());
    }
    
    private ahwx() {
        this.u = 2;
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = ahwx.b) == null) {
                    synchronized (ahwx.class) {
                        if (ahwx.b == null) {
                            ahwx.b = (ahbe)new agzb((agzi)ahwx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahwx.a;
            }
            case 4: {
                return new agza((agzi)ahwx.a);
            }
            case 3: {
                return new ahwx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwx.a, "\u0001\u0011\u0000\u0001\u0002\u0014\u0011\u0000\u0000\u0011\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\f\n\u1409\r\u000b\u1409\u000e\f\u1409\u0001\r\u1409\b\u000e\u1409\t\u000f\u1409\n\u0010\u1409\u000b\u0012\u1409\u0012\u0013\u1409\u000f\u0014\u1409\u0010", new Object[] { "c", "e", "f", "g", "h", "i", "j", "o", "p", "q", "d", "k", "l", "m", "n", "t", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.u = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
