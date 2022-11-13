import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anei extends ahbh implements ahcw
{
    public static final anei a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anei.class, (ahbh)(a = new anei()));
    }
    
    private anei() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anei.c) == null) {
                    synchronized (anei.class) {
                        if (anei.c == null) {
                            anei.c = (ahdd)new ahba((ahbh)anei.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anei.a;
            }
            case 4: {
                return new ahaz((ahbh)anei.a);
            }
            case 3: {
                return new anei();
            }
            case 2: {
                return newMessageInfo((MessageLite)anei.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
