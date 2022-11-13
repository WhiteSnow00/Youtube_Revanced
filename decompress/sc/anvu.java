import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvu extends ahbh implements ahcw
{
    public static final anvu a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anvu.class, (ahbh)(a = new anvu()));
    }
    
    private anvu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anvu.c) == null) {
                    synchronized (anvu.class) {
                        if (anvu.c == null) {
                            anvu.c = (ahdd)new ahba((ahbh)anvu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anvu.a;
            }
            case 4: {
                return new ahaz((ahbh)anvu.a);
            }
            case 3: {
                return new anvu();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
