import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akur extends ahbh implements ahcw
{
    public static final akur a;
    private static volatile ahdd d;
    public akli b;
    public amgv c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akur.class, (ahbh)(a = new akur()));
    }
    
    private akur() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akur.d) == null) {
                    synchronized (akur.class) {
                        if (akur.d == null) {
                            akur.d = (ahdd)new ahba((ahbh)akur.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akur.a;
            }
            case 4: {
                return new ahaz((ahbh)akur.a);
            }
            case 3: {
                return new akur();
            }
            case 2: {
                return newMessageInfo((MessageLite)akur.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
