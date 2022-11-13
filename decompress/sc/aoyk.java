import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyk extends ahbh implements ahcw
{
    public static final aoyk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyk.class, (ahbh)(a = new aoyk()));
    }
    
    private aoyk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyk.b) == null) {
                    synchronized (aoyk.class) {
                        if (aoyk.b == null) {
                            aoyk.b = (ahdd)new ahba((ahbh)aoyk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyk.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyk.a);
            }
            case 3: {
                return new aoyk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyk.a, "\u0001\u0000", (Object[])null);
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
