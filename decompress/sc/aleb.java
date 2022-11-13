import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleb extends ahbh implements ahcw
{
    public static final aleb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aleb.class, (ahbh)(a = new aleb()));
    }
    
    private aleb() {
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
                if ((d = aleb.d) == null) {
                    synchronized (aleb.class) {
                        if (aleb.d == null) {
                            aleb.d = (ahdd)new ahba((ahbh)aleb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aleb.a;
            }
            case 4: {
                return new ahaz((ahbh)aleb.a);
            }
            case 3: {
                return new aleb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aleb.a, "\u0001\u0001\u0001\u0000\uf158\u1824\uf158\u1824\u0001\u0000\u0000\u0001\uf158\u1824\u143c\u0000", new Object[] { "c", "b", anjb.class });
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
