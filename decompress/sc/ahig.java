import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahig extends ahbh implements ahcw
{
    public static final ahig a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahig.class, (ahbh)(a = new ahig()));
    }
    
    private ahig() {
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahig.b) == null) {
                    synchronized (ahig.class) {
                        if (ahig.b == null) {
                            ahig.b = (ahdd)new ahba((ahbh)ahig.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahig.a;
            }
            case 4: {
                return new ahaz((ahbh)ahig.a);
            }
            case 3: {
                return new ahig();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahig.a, "\u0001\u0000", (Object[])null);
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
