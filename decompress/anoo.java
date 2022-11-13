import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anoo extends ahbh implements ahcw
{
    public static final anoo a;
    private static volatile ahdd b;
    private int c;
    private anoy d;
    private anol e;
    private ahmo f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anoo.class, (ahbh)(a = new anoo()));
    }
    
    private anoo() {
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
                if ((b = anoo.b) == null) {
                    synchronized (anoo.class) {
                        if (anoo.b == null) {
                            anoo.b = (ahdd)new ahba((ahbh)anoo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anoo.a;
            }
            case 4: {
                return new ahaz((ahbh)anoo.a);
            }
            case 3: {
                return new anoo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anoo.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0004\u1409\u0004\u0006\u1409\u0001\u0007\u1409\u0003", new Object[] { "c", "d", "g", "e", "f" });
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
