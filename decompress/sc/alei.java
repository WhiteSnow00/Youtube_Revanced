import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alei extends ahbh implements ahcw
{
    public static final alei a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alei.class, (ahbh)(a = new alei()));
    }
    
    private alei() {
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
                if ((d = alei.d) == null) {
                    synchronized (alei.class) {
                        if (alei.d == null) {
                            alei.d = (ahdd)new ahba((ahbh)alei.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alei.a;
            }
            case 4: {
                return new ahaz((ahbh)alei.a);
            }
            case 3: {
                return new alei();
            }
            case 2: {
                return newMessageInfo((MessageLite)alei.a, "\u0001\u0002\u0001\u0000\uf861\u1d50\uf79b\u3a87\u0002\u0000\u0000\u0002\uf861\u1d50\u143c\u0000\uf79b\u3a87\u143c\u0000", new Object[] { "c", "b", alvm.class, apdm.class });
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
