import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyx extends ahbh implements ahcw
{
    public static final aoyx a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyx.class, (ahbh)(a = new aoyx()));
    }
    
    private aoyx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyx.b) == null) {
                    synchronized (aoyx.class) {
                        if (aoyx.b == null) {
                            aoyx.b = (ahdd)new ahba((ahbh)aoyx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyx.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyx.a);
            }
            case 3: {
                return new aoyx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyx.a, "\u0001\u0000", (Object[])null);
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