import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alry extends ahbh implements ahcw
{
    public static final alry a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alry.class, (ahbh)(a = new alry()));
    }
    
    private alry() {
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
                if ((d = alry.d) == null) {
                    synchronized (alry.class) {
                        if (alry.d == null) {
                            alry.d = (ahdd)new ahba((ahbh)alry.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alry.a;
            }
            case 4: {
                return new ahaz((ahbh)alry.a);
            }
            case 3: {
                return new alry();
            }
            case 2: {
                return newMessageInfo((MessageLite)alry.a, "\u0001\u0002\u0001\u0000\uf501\u3e00\ufccc\u4220\u0002\u0000\u0000\u0002\uf501\u3e00\u143c\u0000\ufccc\u4220\u143c\u0000", new Object[] { "c", "b", alqa.class, ajps.class });
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
