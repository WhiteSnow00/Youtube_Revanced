import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpd extends ahbh implements ahcw
{
    public static final alpd a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alpd.class, (ahbh)(a = new alpd()));
    }
    
    private alpd() {
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alpd.b) == null) {
                    synchronized (alpd.class) {
                        if (alpd.b == null) {
                            alpd.b = (ahdd)new ahba((ahbh)alpd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpd.a;
            }
            case 4: {
                return new ahaz((ahbh)alpd.a);
            }
            case 3: {
                return new alpd();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpd.a, "\u0001\u0000", (Object[])null);
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
