import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdp extends ahbh implements ahcw
{
    public static final aqdp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdp.class, (ahbh)(a = new aqdp()));
    }
    
    private aqdp() {
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
                if ((b = aqdp.b) == null) {
                    synchronized (aqdp.class) {
                        if (aqdp.b == null) {
                            aqdp.b = (ahdd)new ahba((ahbh)aqdp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqdp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdp.a);
            }
            case 3: {
                return new aqdp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdp.a, "\u0001\u0000", (Object[])null);
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
