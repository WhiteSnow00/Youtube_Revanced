import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvu extends ahbh implements ahcw
{
    public static final akvu a;
    private static volatile ahdd f;
    public int b;
    public Object c;
    public akli d;
    public boolean e;
    private int g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akvu.class, (ahbh)(a = new akvu()));
    }
    
    private akvu() {
        this.b = 0;
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akvu.f) == null) {
                    synchronized (akvu.class) {
                        if (akvu.f == null) {
                            akvu.f = (ahdd)new ahba((ahbh)akvu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akvu.a;
            }
            case 4: {
                return new ahaz((ahbh)akvu.a);
            }
            case 3: {
                return new akvu();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvu.a, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u143c\u0000\u0004\u1007\u0003\u0005\u143c\u0000", new Object[] { "c", "b", "g", "d", anuv.class, "e", anuv.class });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
