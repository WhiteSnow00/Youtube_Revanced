import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfn extends ahbh implements ahcw
{
    public static final anfn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anfn.class, (ahbh)(a = new anfn()));
    }
    
    private anfn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anfn.b) == null) {
                    synchronized (anfn.class) {
                        if (anfn.b == null) {
                            anfn.b = (ahdd)new ahba((ahbh)anfn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anfn.a;
            }
            case 4: {
                return new ahaz((ahbh)anfn.a);
            }
            case 3: {
                return new anfn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfn.a, "\u0001\u0000", (Object[])null);
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
