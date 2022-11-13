import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anev extends ahbh implements ahcw
{
    public static final anev a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ajut e;
    private apsk f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anev.class, (ahbh)(a = new anev()));
    }
    
    private anev() {
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
                if ((b = anev.b) == null) {
                    synchronized (anev.class) {
                        if (anev.b == null) {
                            anev.b = (ahdd)new ahba((ahbh)anev.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anev.a;
            }
            case 4: {
                return new ahaz((ahbh)anev.a);
            }
            case 3: {
                return new anev();
            }
            case 2: {
                return newMessageInfo((MessageLite)anev.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
