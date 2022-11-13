import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyh extends ahbh implements ahcw
{
    public static final aoyh a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyh.class, (ahbh)(a = new aoyh()));
    }
    
    private aoyh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyh.b) == null) {
                    synchronized (aoyh.class) {
                        if (aoyh.b == null) {
                            aoyh.b = (ahdd)new ahba((ahbh)aoyh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyh.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyh.a);
            }
            case 3: {
                return new aoyh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyh.a, "\u0001\u0000", (Object[])null);
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
