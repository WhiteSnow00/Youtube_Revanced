import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annl extends ahbh implements ahcw
{
    public static final annl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)annl.class, (ahbh)(a = new annl()));
    }
    
    private annl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annl.b) == null) {
                    synchronized (annl.class) {
                        if (annl.b == null) {
                            annl.b = (ahdd)new ahba((ahbh)annl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annl.a;
            }
            case 4: {
                return new ahaz((ahbh)annl.a);
            }
            case 3: {
                return new annl();
            }
            case 2: {
                return newMessageInfo((MessageLite)annl.a, "\u0000\u0000", (Object[])null);
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
