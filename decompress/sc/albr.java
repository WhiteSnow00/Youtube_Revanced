import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albr extends ahbh implements ahcw
{
    public static final albr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)albr.class, (ahbh)(a = new albr()));
    }
    
    private albr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = albr.b) == null) {
                    synchronized (albr.class) {
                        if (albr.b == null) {
                            albr.b = (ahdd)new ahba((ahbh)albr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return albr.a;
            }
            case 4: {
                return new ahaz((ahbh)albr.a);
            }
            case 3: {
                return new albr();
            }
            case 2: {
                return newMessageInfo((MessageLite)albr.a, "\u0001\u0000", (Object[])null);
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
