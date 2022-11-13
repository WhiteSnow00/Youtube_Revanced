import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldn extends ahbh implements ahcw
{
    public static final aldn a;
    private static volatile ahdd d;
    public int b;
    public anap c;
    
    static {
        ahbh.registerDefaultInstance((Class)aldn.class, (ahbh)(a = new aldn()));
    }
    
    private aldn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aldn.d) == null) {
                    synchronized (aldn.class) {
                        if (aldn.d == null) {
                            aldn.d = (ahdd)new ahba((ahbh)aldn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aldn.a;
            }
            case 4: {
                return new ahaz((ahbh)aldn.a);
            }
            case 3: {
                return new aldn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldn.a, "\u0001\u0001\u0000\u0001\ueb3e\u3e20\ueb3e\u3e20\u0001\u0000\u0000\u0000\ueb3e\u3e20\u1009\u0000", new Object[] { "b", "c" });
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
