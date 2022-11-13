import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpz extends ahbh implements ahcw
{
    public static final alpz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alpz.class, (ahbh)(a = new alpz()));
    }
    
    private alpz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alpz.b) == null) {
                    synchronized (alpz.class) {
                        if (alpz.b == null) {
                            alpz.b = (ahdd)new ahba((ahbh)alpz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpz.a;
            }
            case 4: {
                return new ahaz((ahbh)alpz.a);
            }
            case 3: {
                return new alpz();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpz.a, "\u0001\u0000", (Object[])null);
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
