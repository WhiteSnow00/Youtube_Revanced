import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlo extends ahcz implements aheo
{
    public static final amlo a;
    private static volatile ahev t;
    public int b;
    public aowb c;
    public amln d;
    public anxb e;
    public amlm f;
    public amlj g;
    public anxb h;
    public anxb i;
    public amli j;
    public anxb k;
    public anxb l;
    public anxb m;
    public anxb n;
    public anxb o;
    public boolean p;
    public anxb q;
    public anxb r;
    public anxb s;
    private amll u;
    private amll v;
    private amlh w;
    private amlk x;
    private byte y;
    
    static {
        ahcz.registerDefaultInstance(amlo.class, a = new amlo());
    }
    
    private amlo() {
        this.y = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev t;
                if ((t = amlo.t) == null) {
                    synchronized (amlo.class) {
                        if (amlo.t == null) {
                            amlo.t = (ahev)new ahcs((ahcz)amlo.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amlo.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (short[])null);
            }
            case 3: {
                return new amlo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlo.a, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0000\u0014\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\u000b\n\u1409\f\f\u1409\u000e\r\u1409\u000f\u000e\u1409\r\u000f\u1409\u0010\u0010\u1409\u0002\u0011\u1409\t\u0012\u1409\n\u0013\u1007\u0011\u0014\u1409\u0012\u0015\u1409\u0013\u0016\u1409\u0014", new Object[] { "b", "c", "d", "f", "u", "v", "g", "w", "x", "j", "k", "m", "n", "l", "o", "e", "h", "i", "p", "q", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
