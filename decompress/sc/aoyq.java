import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyq extends ahbh implements ahcw
{
    public static final aoyq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyq.class, (ahbh)(a = new aoyq()));
    }
    
    private aoyq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyq.b) == null) {
                    synchronized (aoyq.class) {
                        if (aoyq.b == null) {
                            aoyq.b = (ahdd)new ahba((ahbh)aoyq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyq.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyq.a);
            }
            case 3: {
                return new aoyq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyq.a, "\u0001\u0000", (Object[])null);
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
