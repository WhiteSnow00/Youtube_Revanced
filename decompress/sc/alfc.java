import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfc extends ahbh implements ahcw
{
    public static final alfc a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alfc.class, (ahbh)(a = new alfc()));
    }
    
    private alfc() {
        this.b = 0;
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
                if ((d = alfc.d) == null) {
                    synchronized (alfc.class) {
                        if (alfc.d == null) {
                            alfc.d = (ahdd)new ahba((ahbh)alfc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfc.a;
            }
            case 4: {
                return new ahaz((ahbh)alfc.a);
            }
            case 3: {
                return new alfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)alfc.a, "\u0001\u0004\u0001\u0000\uf321\u1e90\uebde\u2e12\u0004\u0000\u0000\u0004\uf321\u1e90\u143c\u0000\uf437\u1f3b\u143c\u0000\ue3a1\u2d35\u143c\u0000\uebde\u2e12\u143c\u0000", new Object[] { "c", "b", aixf.class, apxx.class, apxy.class, amgf.class });
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
