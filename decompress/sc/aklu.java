import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklu extends ahbh implements ahcw
{
    public static final aklu a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)aklu.class, (ahbh)(a = new aklu()));
    }
    
    private aklu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aklu.d) == null) {
                    synchronized (aklu.class) {
                        if (aklu.d == null) {
                            aklu.d = (ahdd)new ahba((ahbh)aklu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aklu.a;
            }
            case 4: {
                return new ahaz((ahbh)aklu.a);
            }
            case 3: {
                return new aklu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "b", "c" });
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