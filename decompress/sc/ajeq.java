import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeq extends ahbh implements ahcw
{
    private static final ajeq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajeq.class, (ahbh)(a = new ajeq()));
    }
    
    private ajeq() {
    }
    
    public static ajeq a() {
        return ajeq.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajeq.b) == null) {
                    synchronized (ajeq.class) {
                        if (ajeq.b == null) {
                            ajeq.b = (ahdd)new ahba((ahbh)ajeq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajeq.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new ajeq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajeq.a, "\u0001\u0000", (Object[])null);
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
