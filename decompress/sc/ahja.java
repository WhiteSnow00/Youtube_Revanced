import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahja extends ahbh implements ahcw
{
    public static final ahja a;
    private static volatile ahdd f;
    public ajut b;
    public ajut c;
    public ajut d;
    public ajut e;
    private int g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ahja.class, (ahbh)(a = new ahja()));
    }
    
    private ahja() {
        this.i = 2;
        final ahab b = ahab.b;
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
                if ((f = ahja.f) == null) {
                    synchronized (ahja.class) {
                        if (ahja.f == null) {
                            ahja.f = (ahdd)new ahba((ahbh)ahja.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahja.a;
            }
            case 4: {
                return new ahaz((ahbh)ahja.a);
            }
            case 3: {
                return new ahja();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahja.a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004\u1409\u0000\u0005\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003\t\u1409\u0004", new Object[] { "g", "b", "c", "d", "e", "h" });
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
