import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdd extends ahbh implements ahcw
{
    public static final aqdd a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdd.class, (ahbh)(a = new aqdd()));
    }
    
    private aqdd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqdd.e) == null) {
                    synchronized (aqdd.class) {
                        if (aqdd.e == null) {
                            aqdd.e = (ahdd)new ahba((ahbh)aqdd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqdd.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdd.a);
            }
            case 3: {
                return new aqdd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0001\u0002\u100b\u0002", new Object[] { "b", "c", "d" });
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
