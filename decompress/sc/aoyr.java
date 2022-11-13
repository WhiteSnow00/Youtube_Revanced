import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyr extends ahbh implements ahcw
{
    public static final aoyr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyr.class, (ahbh)(a = new aoyr()));
    }
    
    private aoyr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyr.b) == null) {
                    synchronized (aoyr.class) {
                        if (aoyr.b == null) {
                            aoyr.b = (ahdd)new ahba((ahbh)aoyr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyr.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyr.a);
            }
            case 3: {
                return new aoyr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyr.a, "\u0001\u0000", (Object[])null);
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
