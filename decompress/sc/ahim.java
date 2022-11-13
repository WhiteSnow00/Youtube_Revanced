import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahim extends ahbh implements ahcw
{
    public static final ahim a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahim.class, (ahbh)(a = new ahim()));
    }
    
    private ahim() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahim.b) == null) {
                    synchronized (ahim.class) {
                        if (ahim.b == null) {
                            ahim.b = (ahdd)new ahba((ahbh)ahim.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahim.a;
            }
            case 4: {
                return new ahaz((ahbh)ahim.a);
            }
            case 3: {
                return new ahim();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahim.a, "\u0001\u0000", (Object[])null);
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
