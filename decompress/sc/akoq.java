import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoq extends ahbh implements ahcw
{
    public static final akoq a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akoq.class, (ahbh)(a = new akoq()));
    }
    
    private akoq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akoq.e) == null) {
                    synchronized (akoq.class) {
                        if (akoq.e == null) {
                            akoq.e = (ahdd)new ahba((ahbh)akoq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akoq.a;
            }
            case 4: {
                return new ahaz((ahbh)akoq.a);
            }
            case 3: {
                return new akoq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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
