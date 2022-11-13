import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqw extends ahbh implements ahcw
{
    public static final alqw a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alqw.class, (ahbh)(a = new alqw()));
    }
    
    private alqw() {
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
                if ((d = alqw.d) == null) {
                    synchronized (alqw.class) {
                        if (alqw.d == null) {
                            alqw.d = (ahdd)new ahba((ahbh)alqw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqw.a;
            }
            case 4: {
                return new ahaz((ahbh)alqw.a);
            }
            case 3: {
                return new alqw();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqw.a, "\u0001\u0002\u0001\u0000\ufb93\u3f2d\uf602\u6ed0\u0002\u0000\u0000\u0002\ufb93\u3f2d\u143c\u0000\uf602\u6ed0\u143c\u0000", new Object[] { "c", "b", alri.class, alqj.class });
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
