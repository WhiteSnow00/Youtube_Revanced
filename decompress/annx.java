import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annx extends ahbh implements ahcw
{
    public static final annx a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)annx.class, (ahbh)(a = new annx()));
    }
    
    private annx() {
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
                if ((d = annx.d) == null) {
                    synchronized (annx.class) {
                        if (annx.d == null) {
                            annx.d = (ahdd)new ahba((ahbh)annx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return annx.a;
            }
            case 4: {
                return new ahaz((ahbh)annx.a);
            }
            case 3: {
                return new annx();
            }
            case 2: {
                return newMessageInfo((MessageLite)annx.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1036\u0000\u0002\u1036\u0000\u0003\u103b\u0000", new Object[] { "c", "b" });
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
