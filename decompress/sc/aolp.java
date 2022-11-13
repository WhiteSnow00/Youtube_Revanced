import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolp extends ahbh implements ahcw
{
    public static final aolp a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ajut d;
    public anuv e;
    private aolo g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aolp.class, (ahbh)(a = new aolp()));
    }
    
    private aolp() {
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
                final ahdd f;
                if ((f = aolp.f) == null) {
                    synchronized (aolp.class) {
                        if (aolp.f == null) {
                            aolp.f = (ahdd)new ahba((ahbh)aolp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aolp.a;
            }
            case 4: {
                return new ahaz((ahbh)aolp.a);
            }
            case 3: {
                return new aolp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolp.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0001\u0002\u1409\u0002\u0004\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "d", "g", "e" });
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
