import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andm extends ahbh implements ahcw
{
    public static final andm a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)andm.class, (ahbh)(a = new andm()));
    }
    
    private andm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = andm.d) == null) {
                    synchronized (andm.class) {
                        if (andm.d == null) {
                            andm.d = (ahdd)new ahba((ahbh)andm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return andm.a;
            }
            case 4: {
                return new ahaz((ahbh)andm.a);
            }
            case 3: {
                return new andm();
            }
            case 2: {
                return newMessageInfo((MessageLite)andm.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u100c\u0002", new Object[] { "e", "b", "c", anic.f });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
