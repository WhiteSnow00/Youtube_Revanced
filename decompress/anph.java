import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anph extends ahbh implements ahcw
{
    public static final anph a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)anph.class, (ahbh)(a = new anph()));
    }
    
    private anph() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anph.g) == null) {
                    synchronized (anph.class) {
                        if (anph.g == null) {
                            anph.g = (ahdd)new ahba((ahbh)anph.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anph.a;
            }
            case 4: {
                return new ahaz((ahbh)anph.a);
            }
            case 3: {
                return new anph();
            }
            case 2: {
                return newMessageInfo((MessageLite)anph.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", anpe.a(), "d", "e", anpc.a(), "f", anpc.a() });
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
