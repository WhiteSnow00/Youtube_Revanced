import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtp extends ahbh implements ahcw
{
    public static final aqtp a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqtp.class, (ahbh)(a = new aqtp()));
    }
    
    private aqtp() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqtp.d) == null) {
                    synchronized (aqtp.class) {
                        if (aqtp.d == null) {
                            aqtp.d = (ahdd)new ahba((ahbh)aqtp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqtp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqtp.a);
            }
            case 3: {
                return new aqtp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqtp.a, "\u0001\u0004\u0001\u0000\u0003\u0006\u0004\u0000\u0000\u0000\u0003\u103b\u0000\u0004\u103b\u0000\u0005\u103b\u0000\u0006\u103b\u0000", new Object[] { "c", "b" });
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
