import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoys extends ahbh implements ahcw
{
    public static final aoys a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoys.class, (ahbh)(a = new aoys()));
    }
    
    private aoys() {
        emptyProtobufList();
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
                if ((b = aoys.b) == null) {
                    synchronized (aoys.class) {
                        if (aoys.b == null) {
                            aoys.b = (ahdd)new ahba((ahbh)aoys.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoys.a;
            }
            case 4: {
                return new ahaz((ahbh)aoys.a);
            }
            case 3: {
                return new aoys();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoys.a, "\u0001\u0000", (Object[])null);
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
