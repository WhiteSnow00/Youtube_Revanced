import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoo extends ahbh implements ahcw
{
    public static final akoo a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akoo.class, (ahbh)(a = new akoo()));
    }
    
    private akoo() {
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
                if ((d = akoo.d) == null) {
                    synchronized (akoo.class) {
                        if (akoo.d == null) {
                            akoo.d = (ahdd)new ahba((ahbh)akoo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akoo.a;
            }
            case 4: {
                return new ahaz((ahbh)akoo.a);
            }
            case 3: {
                return new akoo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoo.a, "\u0001\u0004\u0001\u0000\uf486\u28b5\ue7fb\u51b0\u0004\u0000\u0000\u0004\uf486\u28b5\u143c\u0000\uf730\u3b2e\u143c\u0000\uf731\u3b2e\u143c\u0000\ue7fb\u51b0\u143c\u0000", new Object[] { "c", "b", ajrv.class, akop.class, akon.class, alnm.class });
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
