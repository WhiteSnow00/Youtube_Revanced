import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvq extends ahbh implements ahcw
{
    public static final anvq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anvq.class, (ahbh)(a = new anvq()));
    }
    
    private anvq() {
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
                if ((b = anvq.b) == null) {
                    synchronized (anvq.class) {
                        if (anvq.b == null) {
                            anvq.b = (ahdd)new ahba((ahbh)anvq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvq.a;
            }
            case 4: {
                return new ahaz((ahbh)anvq.a);
            }
            case 3: {
                return new anvq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvq.a, "\u0001\u0000", (Object[])null);
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
