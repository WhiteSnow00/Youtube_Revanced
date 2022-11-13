import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolv extends ahbh implements ahcw
{
    public static final aolv a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aolv.class, (ahbh)(a = new aolv()));
    }
    
    private aolv() {
        emptyProtobufList();
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
                if ((b = aolv.b) == null) {
                    synchronized (aolv.class) {
                        if (aolv.b == null) {
                            aolv.b = (ahdd)new ahba((ahbh)aolv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aolv.a;
            }
            case 4: {
                return new ahaz((ahbh)aolv.a);
            }
            case 3: {
                return new aolv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolv.a, "\u0001\u0000", (Object[])null);
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
