import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alny extends ahbh implements ahcw
{
    public static final alny a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alny.class, (ahbh)(a = new alny()));
    }
    
    private alny() {
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
                final ahdd b;
                if ((b = alny.b) == null) {
                    synchronized (alny.class) {
                        if (alny.b == null) {
                            alny.b = (ahdd)new ahba((ahbh)alny.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alny.a;
            }
            case 4: {
                return new ahaz((ahbh)alny.a);
            }
            case 3: {
                return new alny();
            }
            case 2: {
                return newMessageInfo((MessageLite)alny.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
