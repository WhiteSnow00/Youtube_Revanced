import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andk extends ahbh implements ahcw
{
    public static final andk a;
    private static volatile ahdd d;
    public int b;
    public ahab c;
    
    static {
        ahbh.registerDefaultInstance((Class)andk.class, (ahbh)(a = new andk()));
    }
    
    private andk() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = andk.d) == null) {
                    synchronized (andk.class) {
                        if (andk.d == null) {
                            andk.d = (ahdd)new ahba((ahbh)andk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return andk.a;
            }
            case 4: {
                return new ahaz((ahbh)andk.a);
            }
            case 3: {
                return new andk();
            }
            case 2: {
                return newMessageInfo((MessageLite)andk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
