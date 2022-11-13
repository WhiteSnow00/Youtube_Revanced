import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arba extends ahbh implements ahcw
{
    public static final arba a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)arba.class, (ahbh)(a = new arba()));
    }
    
    private arba() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = arba.d) == null) {
                    synchronized (arba.class) {
                        if (arba.d == null) {
                            arba.d = (ahdd)new ahba((ahbh)arba.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arba.a;
            }
            case 4: {
                return new ahaz((ahbh)arba.a);
            }
            case 3: {
                return new arba();
            }
            case 2: {
                return newMessageInfo((MessageLite)arba.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1033\u0000\u0002\u103b\u0000", new Object[] { "c", "b" });
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
