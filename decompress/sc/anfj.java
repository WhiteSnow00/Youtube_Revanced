import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfj extends ahbh implements ahcw
{
    public static final anfj a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)anfj.class, (ahbh)(a = new anfj()));
    }
    
    private anfj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anfj.d) == null) {
                    synchronized (anfj.class) {
                        if (anfj.d == null) {
                            anfj.d = (ahdd)new ahba((ahbh)anfj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anfj.a;
            }
            case 4: {
                return new ahaz((ahbh)anfj.a);
            }
            case 3: {
                return new anfj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anfi.a() });
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
