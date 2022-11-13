import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anht extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final anht b;
    private static volatile ahdd d;
    public ahbp c;
    
    static {
        a = (ahbq)new alvv(7);
        ahbh.registerDefaultInstance((Class)anht.class, (ahbh)(b = new anht()));
    }
    
    private anht() {
        this.c = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anht.d) == null) {
                    synchronized (anht.class) {
                        if (anht.d == null) {
                            anht.d = (ahdd)new ahba((ahbh)anht.b);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anht.b;
            }
            case 4: {
                return new ahaz((ahbh)anht.b);
            }
            case 3: {
                return new anht();
            }
            case 2: {
                return newMessageInfo((MessageLite)anht.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "c", anhs.a() });
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
