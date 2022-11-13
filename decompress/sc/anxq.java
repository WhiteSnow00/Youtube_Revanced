import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxq extends ahbh implements ahcw
{
    public static final anxq a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anxq.class, (ahbh)(a = new anxq()));
    }
    
    private anxq() {
        this.f = 2;
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
                final ahdd c;
                if ((c = anxq.c) == null) {
                    synchronized (anxq.class) {
                        if (anxq.c == null) {
                            anxq.c = (ahdd)new ahba((ahbh)anxq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anxq.a;
            }
            case 4: {
                return new ahaz((ahbh)anxq.a);
            }
            case 3: {
                return new anxq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
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
