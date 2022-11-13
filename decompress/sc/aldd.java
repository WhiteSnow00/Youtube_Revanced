import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldd extends ahbh implements ahcw
{
    public static final aldd a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aldd.class, (ahbh)(a = new aldd()));
    }
    
    private aldd() {
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
                if ((d = aldd.d) == null) {
                    synchronized (aldd.class) {
                        if (aldd.d == null) {
                            aldd.d = (ahdd)new ahba((ahbh)aldd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aldd.a;
            }
            case 4: {
                return new ahaz((ahbh)aldd.a);
            }
            case 3: {
                return new aldd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldd.a, "\u0001\u0004\u0001\u0000\ue785\u2e13\ueb52\u9f6f\u0004\u0000\u0000\u0004\ue785\u2e13\u143c\u0000\ufa9b\u48a4\u143c\u0000\uf492\u4933\u143c\u0000\ueb52\u9f6f\u143c\u0000", new Object[] { "c", "b", apgp.class, alvg.class, ajmo.class, apgx.class });
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
