import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apax extends ahbh implements ahcw
{
    public static final apax a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apax.class, (ahbh)(a = new apax()));
    }
    
    private apax() {
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
                if ((d = apax.d) == null) {
                    synchronized (apax.class) {
                        if (apax.d == null) {
                            apax.d = (ahdd)new ahba((ahbh)apax.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apax.a;
            }
            case 4: {
                return new ahaz((ahbh)apax.a);
            }
            case 3: {
                return new apax();
            }
            case 2: {
                return newMessageInfo((MessageLite)apax.a, "\u0001\u0002\u0001\u0000\uf26a\u2912\ue91b\u3cbe\u0002\u0000\u0000\u0002\uf26a\u2912\u143c\u0000\ue91b\u3cbe\u143c\u0000", new Object[] { "c", "b", aljh.class, apai.class });
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
