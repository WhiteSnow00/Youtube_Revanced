import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdb extends ahbh implements ahcw
{
    public static final aqdb a;
    private static volatile ahdd e;
    public int b;
    public ahdy c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdb.class, (ahbh)(a = new aqdb()));
    }
    
    private aqdb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqdb.e) == null) {
                    synchronized (aqdb.class) {
                        if (aqdb.e == null) {
                            aqdb.e = (ahdd)new ahba((ahbh)aqdb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqdb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdb.a);
            }
            case 3: {
                return new aqdb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0001\u0002\u1009\u0000", new Object[] { "b", "d", "c" });
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
