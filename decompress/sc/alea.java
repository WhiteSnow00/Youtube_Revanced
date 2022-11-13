import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alea extends ahbh implements ahcw
{
    public static final alea a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alea.class, (ahbh)(a = new alea()));
    }
    
    private alea() {
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
                if ((d = alea.d) == null) {
                    synchronized (alea.class) {
                        if (alea.d == null) {
                            alea.d = (ahdd)new ahba((ahbh)alea.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alea.a;
            }
            case 4: {
                return new ahaz((ahbh)alea.a);
            }
            case 3: {
                return new alea();
            }
            case 2: {
                return newMessageInfo((MessageLite)alea.a, "\u0001\u0002\u0001\u0000\uf861\u1d50\uf79b\u3a87\u0002\u0000\u0000\u0002\uf861\u1d50\u143c\u0000\uf79b\u3a87\u143c\u0000", new Object[] { "c", "b", alvm.class, apdm.class });
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
