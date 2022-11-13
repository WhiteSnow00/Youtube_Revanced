import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomq extends ahbh implements ahcw
{
    public static final aomq a;
    private static volatile ahdd c;
    public float b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aomq.class, (ahbh)(a = new aomq()));
    }
    
    private aomq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aomq.c) == null) {
                    synchronized (aomq.class) {
                        if (aomq.c == null) {
                            aomq.c = (ahdd)new ahba((ahbh)aomq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aomq.a;
            }
            case 4: {
                return new ahaz((ahbh)aomq.a);
            }
            case 3: {
                return new aomq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1001\u0001", new Object[] { "d", "b" });
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
