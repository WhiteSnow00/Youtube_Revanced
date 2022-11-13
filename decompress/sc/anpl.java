import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpl extends ahbh implements ahcw
{
    public static final anpl a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public float d;
    
    static {
        ahbh.registerDefaultInstance((Class)anpl.class, (ahbh)(a = new anpl()));
    }
    
    private anpl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anpl.e) == null) {
                    synchronized (anpl.class) {
                        if (anpl.e == null) {
                            anpl.e = (ahdd)new ahba((ahbh)anpl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anpl.a;
            }
            case 4: {
                return new ahaz((ahbh)anpl.a);
            }
            case 3: {
                return new anpl();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001", new Object[] { "b", "c", anqj.b, "d" });
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
