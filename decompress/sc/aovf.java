import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovf extends ahbh implements ahcw
{
    public static final aovf a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aovf.class, (ahbh)(a = new aovf()));
    }
    
    private aovf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aovf.c) == null) {
                    synchronized (aovf.class) {
                        if (aovf.c == null) {
                            aovf.c = (ahdd)new ahba((ahbh)aovf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aovf.a;
            }
            case 4: {
                return new ahaz((ahbh)aovf.a);
            }
            case 3: {
                return new aovf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aove.a });
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
