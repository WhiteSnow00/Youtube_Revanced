import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anop extends ahbh implements ahcw
{
    public static final anop a;
    private static volatile ahdd c;
    public int b;
    private aocv d;
    
    static {
        ahbh.registerDefaultInstance((Class)anop.class, (ahbh)(a = new anop()));
    }
    
    private anop() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anop.c) == null) {
                    synchronized (anop.class) {
                        if (anop.c == null) {
                            anop.c = (ahdd)new ahba((ahbh)anop.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anop.a;
            }
            case 4: {
                return new ahaz((ahbh)anop.a);
            }
            case 3: {
                return new anop();
            }
            case 2: {
                return newMessageInfo((MessageLite)anop.a, "\u0001\u0001\u0000\u0001\ue8fb\u2f0e\ue8fb\u2f0e\u0001\u0000\u0000\u0000\ue8fb\u2f0e\u1009\u0000", new Object[] { "b", "d" });
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
