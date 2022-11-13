import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyi extends ahbh implements ahcw
{
    public static final aoyi a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyi.class, (ahbh)(a = new aoyi()));
    }
    
    private aoyi() {
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
                if ((b = aoyi.b) == null) {
                    synchronized (aoyi.class) {
                        if (aoyi.b == null) {
                            aoyi.b = (ahdd)new ahba((ahbh)aoyi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyi.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyi.a);
            }
            case 3: {
                return new aoyi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyi.a, "\u0001\u0000", (Object[])null);
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
