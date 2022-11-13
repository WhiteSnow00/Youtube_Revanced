import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alos extends ahbh implements ahcw
{
    public static final alos a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alos.class, (ahbh)(a = new alos()));
    }
    
    private alos() {
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
                if ((b = alos.b) == null) {
                    synchronized (alos.class) {
                        if (alos.b == null) {
                            alos.b = (ahdd)new ahba((ahbh)alos.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alos.a;
            }
            case 4: {
                return new ahaz((ahbh)alos.a);
            }
            case 3: {
                return new alos();
            }
            case 2: {
                return newMessageInfo((MessageLite)alos.a, "\u0001\u0000", (Object[])null);
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
