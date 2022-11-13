import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epn extends ahbh implements ahcw
{
    public static final epn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)epn.class, (ahbh)(a = new epn()));
    }
    
    private epn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = epn.b) == null) {
                    synchronized (epn.class) {
                        if (epn.b == null) {
                            epn.b = (ahdd)new ahba((ahbh)epn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return epn.a;
            }
            case 4: {
                return new ahaz((ahbh)epn.a);
            }
            case 3: {
                return new epn();
            }
            case 2: {
                return newMessageInfo((MessageLite)epn.a, "\u0000\u0000", (Object[])null);
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
