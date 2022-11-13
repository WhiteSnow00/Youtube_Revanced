import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anct extends ahbh implements ahcw
{
    public static final anct a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)anct.class, (ahbh)(a = new anct()));
    }
    
    private anct() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anct.d) == null) {
                    synchronized (anct.class) {
                        if (anct.d == null) {
                            anct.d = (ahdd)new ahba((ahbh)anct.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anct.a;
            }
            case 4: {
                return new ahaz((ahbh)anct.a);
            }
            case 3: {
                return new anct();
            }
            case 2: {
                return newMessageInfo((MessageLite)anct.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
