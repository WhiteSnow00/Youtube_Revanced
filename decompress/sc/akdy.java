import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdy extends ahbh implements ahcw
{
    public static final akdy a;
    private static volatile ahdd g;
    public int b;
    public ajut c;
    public ajut d;
    public anuv e;
    public aiqj f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akdy.class, (ahbh)(a = new akdy()));
    }
    
    private akdy() {
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
                final ahdd g;
                if ((g = akdy.g) == null) {
                    synchronized (akdy.class) {
                        if (akdy.g == null) {
                            akdy.g = (ahdd)new ahba((ahbh)akdy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akdy.a;
            }
            case 4: {
                return new ahaz((ahbh)akdy.a);
            }
            case 3: {
                return new akdy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdy.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
