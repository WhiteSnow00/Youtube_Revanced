import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appe extends ahbh implements ahcw
{
    public static final appe a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)appe.class, (ahbh)(a = new appe()));
    }
    
    private appe() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = appe.c) == null) {
                    synchronized (appe.class) {
                        if (appe.c == null) {
                            appe.c = (ahdd)new ahba((ahbh)appe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return appe.a;
            }
            case 4: {
                return new ahaz((ahbh)appe.a);
            }
            case 3: {
                return new appe();
            }
            case 2: {
                return newMessageInfo((MessageLite)appe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apow.j });
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
