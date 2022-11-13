import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqu extends ahbh implements ahcw
{
    public static final alqu a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alqu.class, (ahbh)(a = new alqu()));
    }
    
    private alqu() {
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
                if ((d = alqu.d) == null) {
                    synchronized (alqu.class) {
                        if (alqu.d == null) {
                            alqu.d = (ahdd)new ahba((ahbh)alqu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqu.a;
            }
            case 4: {
                return new ahaz((ahbh)alqu.a);
            }
            case 3: {
                return new alqu();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqu.a, "\u0001\u0002\u0001\u0000\ufc43\u196f\uff36\u42bd\u0002\u0000\u0000\u0002\ufc43\u196f\u143c\u0000\uff36\u42bd\u143c\u0000", new Object[] { "c", "b", ajfd.class, alpv.class });
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
