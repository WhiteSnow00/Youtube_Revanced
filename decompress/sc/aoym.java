import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoym extends ahbh implements ahcw
{
    public static final aoym a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoym.class, (ahbh)(a = new aoym()));
    }
    
    private aoym() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoym.b) == null) {
                    synchronized (aoym.class) {
                        if (aoym.b == null) {
                            aoym.b = (ahdd)new ahba((ahbh)aoym.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoym.a;
            }
            case 4: {
                return new ahaz((ahbh)aoym.a);
            }
            case 3: {
                return new aoym();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoym.a, "\u0001\u0000", (Object[])null);
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
