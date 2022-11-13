import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfd extends ahbh implements ahcw
{
    public static final akfd a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private amgv e;
    private anuv f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akfd.class, (ahbh)(a = new akfd()));
    }
    
    private akfd() {
        this.h = 2;
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = akfd.b) == null) {
                    synchronized (akfd.class) {
                        if (akfd.b == null) {
                            akfd.b = (ahdd)new ahba((ahbh)akfd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfd.a;
            }
            case 4: {
                return new ahaz((ahbh)akfd.a);
            }
            case 3: {
                return new akfd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfd.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
