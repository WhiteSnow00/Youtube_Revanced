import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apaa extends ahbh implements ahcw
{
    public static final apaa a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ajut d;
    public anuv e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)apaa.class, (ahbh)(a = new apaa()));
    }
    
    private apaa() {
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
                final ahdd f;
                if ((f = apaa.f) == null) {
                    synchronized (apaa.class) {
                        if (apaa.f == null) {
                            apaa.f = (ahdd)new ahba((ahbh)apaa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apaa.a;
            }
            case 4: {
                return new ahaz((ahbh)apaa.a);
            }
            case 3: {
                return new apaa();
            }
            case 2: {
                return newMessageInfo((MessageLite)apaa.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "g", "e" });
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
