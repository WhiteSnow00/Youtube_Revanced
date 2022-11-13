import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldk extends ahbh implements ahcw
{
    public static final aldk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aldk.class, (ahbh)(a = new aldk()));
    }
    
    private aldk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aldk.b) == null) {
                    synchronized (aldk.class) {
                        if (aldk.b == null) {
                            aldk.b = (ahdd)new ahba((ahbh)aldk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aldk.a;
            }
            case 4: {
                return new ahaz((ahbh)aldk.a);
            }
            case 3: {
                return new aldk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldk.a, "\u0001\u0000", (Object[])null);
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
