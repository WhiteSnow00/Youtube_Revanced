import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anur extends ahbh implements ahcw
{
    public static final anur a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anur.class, (ahbh)(a = new anur()));
    }
    
    private anur() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anur.e) == null) {
                    synchronized (anur.class) {
                        if (anur.e == null) {
                            anur.e = (ahdd)new ahba((ahbh)anur.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anur.a;
            }
            case 4: {
                return new ahaz((ahbh)anur.a);
            }
            case 3: {
                return new anur();
            }
            case 2: {
                return newMessageInfo((MessageLite)anur.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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
