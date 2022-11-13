import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyn extends ahbh implements ahcw
{
    public static final aoyn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyn.class, (ahbh)(a = new aoyn()));
    }
    
    private aoyn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyn.b) == null) {
                    synchronized (aoyn.class) {
                        if (aoyn.b == null) {
                            aoyn.b = (ahdd)new ahba((ahbh)aoyn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyn.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyn.a);
            }
            case 3: {
                return new aoyn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyn.a, "\u0001\u0000", (Object[])null);
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
