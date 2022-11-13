import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouw extends ahbh implements ahcw
{
    public static final aouw a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aouw.class, (ahbh)(a = new aouw()));
    }
    
    private aouw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aouw.e) == null) {
                    synchronized (aouw.class) {
                        if (aouw.e == null) {
                            aouw.e = (ahdd)new ahba((ahbh)aouw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aouw.a;
            }
            case 4: {
                return new ahaz((ahbh)aouw.a);
            }
            case 3: {
                return new aouw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aouw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
