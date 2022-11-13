import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiz extends ahbh implements ahcw
{
    public static final aoiz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoiz.class, (ahbh)(a = new aoiz()));
    }
    
    private aoiz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoiz.b) == null) {
                    synchronized (aoiz.class) {
                        if (aoiz.b == null) {
                            aoiz.b = (ahdd)new ahba((ahbh)aoiz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoiz.a;
            }
            case 4: {
                return new ahaz((ahbh)aoiz.a);
            }
            case 3: {
                return new aoiz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoiz.a, "\u0001\u0000", (Object[])null);
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
