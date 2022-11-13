import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahir extends ahbh implements ahcw
{
    public static final ahir a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahir.class, (ahbh)(a = new ahir()));
    }
    
    private ahir() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahir.b) == null) {
                    synchronized (ahir.class) {
                        if (ahir.b == null) {
                            ahir.b = (ahdd)new ahba((ahbh)ahir.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahir.a;
            }
            case 4: {
                return new ahaz((ahbh)ahir.a);
            }
            case 3: {
                return new ahir();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahir.a, "\u0001\u0000", (Object[])null);
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
