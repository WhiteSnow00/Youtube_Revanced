import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahih extends ahbh implements ahcw
{
    public static final ahih a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahih.class, (ahbh)(a = new ahih()));
    }
    
    private ahih() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahih.b) == null) {
                    synchronized (ahih.class) {
                        if (ahih.b == null) {
                            ahih.b = (ahdd)new ahba((ahbh)ahih.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahih.a;
            }
            case 4: {
                return new ahaz((ahbh)ahih.a);
            }
            case 3: {
                return new ahih();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahih.a, "\u0000\u0000", (Object[])null);
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
