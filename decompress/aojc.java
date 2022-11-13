import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojc extends ahbh implements ahcw
{
    public static final aojc a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aojc.class, (ahbh)(a = new aojc()));
    }
    
    private aojc() {
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
                if ((b = aojc.b) == null) {
                    synchronized (aojc.class) {
                        if (aojc.b == null) {
                            aojc.b = (ahdd)new ahba((ahbh)aojc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojc.a;
            }
            case 4: {
                return new ahaz((ahbh)aojc.a);
            }
            case 3: {
                return new aojc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojc.a, "\u0001\u0000", (Object[])null);
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
