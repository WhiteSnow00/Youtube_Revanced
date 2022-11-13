import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aign extends ahbh implements ahcw
{
    public static final aign a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aign.class, (ahbh)(a = new aign()));
    }
    
    private aign() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aign.c) == null) {
                    synchronized (aign.class) {
                        if (aign.c == null) {
                            aign.c = (ahdd)new ahba((ahbh)aign.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aign.a;
            }
            case 4: {
                return new ahaz((ahbh)aign.a);
            }
            case 3: {
                return new aign();
            }
            case 2: {
                return newMessageInfo((MessageLite)aign.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aieh.f });
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
