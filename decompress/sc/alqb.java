import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqb extends ahbh implements ahcw
{
    public static final alqb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private anuv g;
    private anuv h;
    private ajut i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)alqb.class, (ahbh)(a = new alqb()));
    }
    
    private alqb() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alqb.b) == null) {
                    synchronized (alqb.class) {
                        if (alqb.b == null) {
                            alqb.b = (ahdd)new ahba((ahbh)alqb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqb.a;
            }
            case 4: {
                return new ahaz((ahbh)alqb.a);
            }
            case 3: {
                return new alqb();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqb.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}