import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzb extends ahbh implements ahcw
{
    public static final aqzb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzb.class, (ahbh)(a = new aqzb()));
    }
    
    private aqzb() {
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
                if ((d = aqzb.d) == null) {
                    synchronized (aqzb.class) {
                        if (aqzb.d == null) {
                            aqzb.d = (ahdd)new ahba((ahbh)aqzb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqzb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqzb.a);
            }
            case 3: {
                return new aqzb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzb.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ahfu.class, ahfu.class });
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
