import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amki extends ahbh implements ahcw
{
    public static final amki a;
    private static volatile ahdd e;
    public int b;
    public Object c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)amki.class, (ahbh)(a = new amki()));
    }
    
    private amki() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = amki.e) == null) {
                    synchronized (amki.class) {
                        if (amki.e == null) {
                            amki.e = (ahdd)new ahba((ahbh)amki.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amki.a;
            }
            case 4: {
                return new ahaz((ahbh)amki.a);
            }
            case 3: {
                return new amki();
            }
            case 2: {
                return newMessageInfo((MessageLite)amki.a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u103a\u0000", new Object[] { "c", "b", "f", "d", ameu.t });
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
