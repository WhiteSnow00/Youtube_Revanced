import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahks extends ahbh implements ahcw
{
    public static final ahks a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahks.class, (ahbh)(a = new ahks()));
    }
    
    private ahks() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahks.b) == null) {
                    synchronized (ahks.class) {
                        if (ahks.b == null) {
                            ahks.b = (ahdd)new ahba((ahbh)ahks.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahks.a;
            }
            case 4: {
                return new ahaz((ahbh)ahks.a);
            }
            case 3: {
                return new ahks();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahks.a, "\u0001\u0000", (Object[])null);
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
