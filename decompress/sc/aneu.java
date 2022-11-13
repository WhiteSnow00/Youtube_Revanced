import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aneu extends ahbh implements ahcw
{
    public static final aneu a;
    private static volatile ahdd d;
    public int b;
    public ajby c;
    
    static {
        ahbh.registerDefaultInstance((Class)aneu.class, (ahbh)(a = new aneu()));
    }
    
    private aneu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aneu.d) == null) {
                    synchronized (aneu.class) {
                        if (aneu.d == null) {
                            aneu.d = (ahdd)new ahba((ahbh)aneu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aneu.a;
            }
            case 4: {
                return new ahaz((float[][])null, (float[])null);
            }
            case 3: {
                return new aneu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aneu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
