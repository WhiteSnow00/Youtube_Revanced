import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgv extends ahbh implements ahcw
{
    public static final ahgv a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahgv.class, (ahbh)(a = new ahgv()));
    }
    
    private ahgv() {
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
                if ((b = ahgv.b) == null) {
                    synchronized (ahgv.class) {
                        if (ahgv.b == null) {
                            ahgv.b = (ahdd)new ahba((ahbh)ahgv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgv.a;
            }
            case 4: {
                return new ahaz((ahbh)ahgv.a);
            }
            case 3: {
                return new ahgv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahgv.a, "\u0001\u0000", (Object[])null);
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
