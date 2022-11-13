import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyz extends ahbh implements ahcw
{
    public static final aoyz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyz.class, (ahbh)(a = new aoyz()));
    }
    
    private aoyz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyz.b) == null) {
                    synchronized (aoyz.class) {
                        if (aoyz.b == null) {
                            aoyz.b = (ahdd)new ahba((ahbh)aoyz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyz.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyz.a);
            }
            case 3: {
                return new aoyz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyz.a, "\u0001\u0000", (Object[])null);
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
