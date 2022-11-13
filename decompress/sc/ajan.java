import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajan extends ahbh implements ahcw
{
    public static final ajan a;
    private static volatile ahdd e;
    public long b;
    public long c;
    public long d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajan.class, (ahbh)(a = new ajan()));
    }
    
    private ajan() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajan.e) == null) {
                    synchronized (ajan.class) {
                        if (ajan.e == null) {
                            ajan.e = (ahdd)new ahba((ahbh)ajan.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajan.a;
            }
            case 4: {
                return new ahaz((ahbh)ajan.a);
            }
            case 3: {
                return new ajan();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajan.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "f", "b", "c", "d" });
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
