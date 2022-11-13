import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoi extends ahbh implements ahcw
{
    public static final apoi a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apoi.class, (ahbh)(a = new apoi()));
    }
    
    private apoi() {
        this.f = 2;
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = apoi.b) == null) {
                    synchronized (apoi.class) {
                        if (apoi.b == null) {
                            apoi.b = (ahdd)new ahba((ahbh)apoi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoi.a;
            }
            case 4: {
                return new ahaz((ahbh)apoi.a);
            }
            case 3: {
                return new apoi();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoi.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
