import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkz extends ahcz implements aheo
{
    public static final amkz a;
    private static volatile ahev t;
    private byte A;
    public int b;
    public ajws c;
    public ajws d;
    public amky e;
    public amky f;
    public anxb g;
    public anxb h;
    public amkx i;
    public anxb j;
    public anxb k;
    public aowb l;
    public ajws m;
    public ajws n;
    public ajws o;
    public akfj p;
    public boolean q;
    public boolean r;
    public anxb s;
    private amla u;
    private amkw v;
    private anxb w;
    private anxb x;
    private amnh y;
    private ajws z;
    
    static {
        ahcz.registerDefaultInstance(amkz.class, a = new amkz());
    }
    
    private amkz() {
        this.A = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte a2 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev t;
                if ((t = amkz.t) == null) {
                    synchronized (amkz.class) {
                        if (amkz.t == null) {
                            amkz.t = (ahev)new ahcs((ahcz)amkz.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amkz.a;
            }
            case 4: {
                return new ahcr((ahcz)amkz.a);
            }
            case 3: {
                return new amkz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkz.a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0015\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\b\u0006\u1409\u0005\u0007\u1409\t\b\u1409\n\t\u1409\r\n\u1409\u0006\u000b\u1409\u0007\f\u1409\f\r\u1409\u000e\u000e\u1409\u000f\u0010\u1409\u000b\u0011\u1409\u0001\u0012\u1409\u0010\u0013\u1409\u0011\u0015\u1007\u0013\u0016\u1409\u0014\u0017\u1409\u0015\u0019\u1007\u0017\u001a\u1409\u0018", new Object[] { "b", "c", "e", "f", "u", "i", "v", "j", "w", "l", "g", "h", "k", "m", "n", "x", "d", "o", "p", "q", "y", "z", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    a2 = 0;
                }
                this.A = a2;
                return null;
            }
            case 0: {
                return this.A;
            }
        }
    }
}
