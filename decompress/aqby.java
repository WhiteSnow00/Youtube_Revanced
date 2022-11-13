import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqby extends ahbh implements ahcw
{
    public static final aqby a;
    private static volatile ahdd d;
    public int b;
    public float c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqby.class, (ahbh)(a = new aqby()));
    }
    
    private aqby() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqby.d) == null) {
                    synchronized (aqby.class) {
                        if (aqby.d == null) {
                            aqby.d = (ahdd)new ahba((ahbh)aqby.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqby.a;
            }
            case 4: {
                return new ahaz((ahbh)aqby.a);
            }
            case 3: {
                return new aqby();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqby.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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
