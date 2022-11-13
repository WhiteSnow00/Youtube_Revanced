import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkv extends ahbh implements ahcw
{
    public static final amkv a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkv.class, (ahbh)(a = new amkv()));
    }
    
    private amkv() {
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
                if ((d = amkv.d) == null) {
                    synchronized (amkv.class) {
                        if (amkv.d == null) {
                            amkv.d = (ahdd)new ahba((ahbh)amkv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amkv.a;
            }
            case 4: {
                return new ahaz((ahbh)amkv.a);
            }
            case 3: {
                return new amkv();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkv.a, "\u0001\u0001\u0001\u0000\uf03a\u2b94\uf03a\u2b94\u0001\u0000\u0000\u0001\uf03a\u2b94\u143c\u0000", new Object[] { "c", "b", aias.class });
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
