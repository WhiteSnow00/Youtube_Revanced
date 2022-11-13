import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqd extends ahbh implements ahcw
{
    public static final alqd a;
    private static volatile ahdd j;
    public int b;
    public String c;
    public akdi d;
    public String e;
    public ahil f;
    public boolean g;
    public String h;
    public ahab i;
    private ahhu k;
    private aiqj l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)alqd.class, (ahbh)(a = new alqd()));
    }
    
    private alqd() {
        this.m = 2;
        this.c = "";
        this.e = "";
        this.h = "";
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = alqd.j) == null) {
                    synchronized (alqd.class) {
                        if (alqd.j == null) {
                            alqd.j = (ahdd)new ahba((ahbh)alqd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alqd.a;
            }
            case 4: {
                return new ahaz((ahbh)alqd.a);
            }
            case 3: {
                return new alqd();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqd.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0005\u1007\u0004\u0007\u1409\u0007\b\u100a\b\t\u1008\u0006\n\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "k", "i", "h", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
