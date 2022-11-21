import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardy extends ahcz implements aheo
{
    public static final ahdi a;
    public static final ardy b;
    private static volatile ahev q;
    public int c;
    public ared d;
    public String e;
    public ahdh f;
    public String g;
    public int h;
    public String i;
    public areb j;
    public arej k;
    public area l;
    public long m;
    public aogz n;
    public int o;
    public int p;
    private byte r;
    
    static {
        a = (ahdi)new alxv(19);
        ahcz.registerDefaultInstance(ardy.class, b = new ardy());
    }
    
    private ardy() {
        this.r = 2;
        this.e = "";
        this.f = ahcz.emptyIntList();
        this.g = "";
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev q;
                if ((q = ardy.q) == null) {
                    synchronized (ardy.class) {
                        if (ardy.q == null) {
                            ardy.q = (ahev)new ahcs((ahcz)ardy.b);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return ardy.b;
            }
            case 4: {
                return new ahcr((char[][][])null, (byte[])null);
            }
            case 3: {
                return new ardy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardy.b, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0003,\u0004\u1008\u0002\u0005\u1004\u0003\u0006\u1008\u0004\u0007\u1409\u0005\b\u1009\u0006\t\u1409\u0007\n\u1003\b\u000b\u1009\t\f\u1004\n\r\u1004\u000b", new Object[] { "c", "d", "e", "f", aohb.a(), "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
