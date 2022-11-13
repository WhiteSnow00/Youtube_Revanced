import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anew extends ahbh implements ahcw
{
    public static final anew a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ajut d;
    public aida e;
    private ajut g;
    private aida h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)anew.class, (ahbh)(a = new anew()));
    }
    
    private anew() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anew.f) == null) {
                    synchronized (anew.class) {
                        if (anew.f == null) {
                            anew.f = (ahdd)new ahba((ahbh)anew.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anew.a;
            }
            case 4: {
                return new ahaz((ahbh)anew.a);
            }
            case 3: {
                return new anew();
            }
            case 2: {
                return newMessageInfo((MessageLite)anew.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0000\u0004\u1409\u0003\u0007\u1409\u0004", new Object[] { "b", "d", "g", "c", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
