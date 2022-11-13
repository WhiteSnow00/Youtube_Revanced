import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiu extends ahbh implements ahcw
{
    public static final amiu a;
    private static volatile ahdd t;
    private byte A;
    public int b;
    public ajut c;
    public ajut d;
    public amit e;
    public amit f;
    public anuv g;
    public anuv h;
    public amis i;
    public anuv j;
    public anuv k;
    public aotp l;
    public ajut m;
    public ajut n;
    public ajut o;
    public akdi p;
    public boolean q;
    public boolean r;
    public anuv s;
    private amiv u;
    private amir v;
    private anuv w;
    private anuv x;
    private amlc y;
    private ajut z;
    
    static {
        ahbh.registerDefaultInstance((Class)amiu.class, (ahbh)(a = new amiu()));
    }
    
    private amiu() {
        this.A = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte a2 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd t;
                if ((t = amiu.t) == null) {
                    synchronized (amiu.class) {
                        if (amiu.t == null) {
                            amiu.t = (ahdd)new ahba((ahbh)amiu.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amiu.a;
            }
            case 4: {
                return new ahaz((ahbh)amiu.a);
            }
            case 3: {
                return new amiu();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiu.a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0015\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\b\u0006\u1409\u0005\u0007\u1409\t\b\u1409\n\t\u1409\r\n\u1409\u0006\u000b\u1409\u0007\f\u1409\f\r\u1409\u000e\u000e\u1409\u000f\u0010\u1409\u000b\u0011\u1409\u0001\u0012\u1409\u0010\u0013\u1409\u0011\u0015\u1007\u0013\u0016\u1409\u0014\u0017\u1409\u0015\u0019\u1007\u0017\u001a\u1409\u0018", new Object[] { "b", "c", "e", "f", "u", "i", "v", "j", "w", "l", "g", "h", "k", "m", "n", "x", "d", "o", "p", "q", "y", "z", "r", "s" });
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
