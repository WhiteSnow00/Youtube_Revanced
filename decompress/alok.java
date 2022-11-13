import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alok extends ahbh implements ahcw
{
    public static final alok a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private ahhu f;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alok.class, (ahbh)(a = new alok()));
    }
    
    private alok() {
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
                if ((b = alok.b) == null) {
                    synchronized (alok.class) {
                        if (alok.b == null) {
                            alok.b = (ahdd)new ahba((ahbh)alok.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alok.a;
            }
            case 4: {
                return new ahaz((ahbh)alok.a);
            }
            case 3: {
                return new alok();
            }
            case 2: {
                return newMessageInfo((MessageLite)alok.a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g" });
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
