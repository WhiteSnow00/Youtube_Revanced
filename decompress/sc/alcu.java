import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcu extends ahbh implements ahcw
{
    public static final alcu a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alcu.class, (ahbh)(a = new alcu()));
    }
    
    private alcu() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alcu.d) == null) {
                    synchronized (alcu.class) {
                        if (alcu.d == null) {
                            alcu.d = (ahdd)new ahba((ahbh)alcu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alcu.a;
            }
            case 4: {
                return new ahaz((ahbh)alcu.a);
            }
            case 3: {
                return new alcu();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
