import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appl extends ahbh implements ahcw
{
    public static final appl a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)appl.class, (ahbh)(a = new appl()));
    }
    
    private appl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = appl.d) == null) {
                    synchronized (appl.class) {
                        if (appl.d == null) {
                            appl.d = (ahdd)new ahba((ahbh)appl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appl.a;
            }
            case 4: {
                return new ahaz((ahbh)appl.a);
            }
            case 3: {
                return new appl();
            }
            case 2: {
                return newMessageInfo((MessageLite)appl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
