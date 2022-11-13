import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyl extends ahbh implements ahcw
{
    public static final aoyl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyl.class, (ahbh)(a = new aoyl()));
    }
    
    private aoyl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyl.b) == null) {
                    synchronized (aoyl.class) {
                        if (aoyl.b == null) {
                            aoyl.b = (ahdd)new ahba((ahbh)aoyl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyl.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyl.a);
            }
            case 3: {
                return new aoyl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyl.a, "\u0001\u0000", (Object[])null);
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
