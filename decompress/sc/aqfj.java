import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfj extends ahbh implements ahcw
{
    public static final aqfj a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfj.class, (ahbh)(a = new aqfj()));
    }
    
    private aqfj() {
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
                if ((d = aqfj.d) == null) {
                    synchronized (aqfj.class) {
                        if (aqfj.d == null) {
                            aqfj.d = (ahdd)new ahba((ahbh)aqfj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfj.a);
            }
            case 3: {
                return new aqfj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfj.a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u1034\u0000\u0003\u103b\u0000\u0004\u103a\u0000\u0005\u103d\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u1037\u0000\t\u103e\u0000", new Object[] { "c", "b", aqcl.l, aqfi.class, aqfd.class });
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
