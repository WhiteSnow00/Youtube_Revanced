import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrz extends ahbh implements ahcw
{
    public static final alrz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alrz.class, (ahbh)(a = new alrz()));
    }
    
    private alrz() {
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
                if ((d = alrz.d) == null) {
                    synchronized (alrz.class) {
                        if (alrz.d == null) {
                            alrz.d = (ahdd)new ahba((ahbh)alrz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrz.a;
            }
            case 4: {
                return new ahaz((ahbh)alrz.a);
            }
            case 3: {
                return new alrz();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrz.a, "\u0001\u0001\u0001\u0000\uf788\u3e01\uf788\u3e01\u0001\u0000\u0000\u0001\uf788\u3e01\u143c\u0000", new Object[] { "c", "b", alqe.class });
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
