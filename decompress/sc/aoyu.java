import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyu extends ahbh implements ahcw
{
    public static final aoyu a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyu.class, (ahbh)(a = new aoyu()));
    }
    
    private aoyu() {
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyu.b) == null) {
                    synchronized (aoyu.class) {
                        if (aoyu.b == null) {
                            aoyu.b = (ahdd)new ahba((ahbh)aoyu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyu.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyu.a);
            }
            case 3: {
                return new aoyu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyu.a, "\u0001\u0000", (Object[])null);
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
