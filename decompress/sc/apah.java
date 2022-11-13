import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apah extends ahbh implements ahcw
{
    public static final apah a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apah.class, (ahbh)(a = new apah()));
    }
    
    private apah() {
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
                if ((d = apah.d) == null) {
                    synchronized (apah.class) {
                        if (apah.d == null) {
                            apah.d = (ahdd)new ahba((ahbh)apah.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apah.a;
            }
            case 4: {
                return new ahaz((ahbh)apah.a);
            }
            case 3: {
                return new apah();
            }
            case 2: {
                return newMessageInfo((MessageLite)apah.a, "\u0001\u0004\u0001\u0000\uf321\u1e90\ue91b\u3cbe\u0004\u0000\u0000\u0004\uf321\u1e90\u143c\u0000\uf26a\u2912\u143c\u0000\uf49e\u3c94\u143c\u0000\ue91b\u3cbe\u143c\u0000", new Object[] { "c", "b", aixf.class, aljh.class, apaj.class, apai.class });
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
