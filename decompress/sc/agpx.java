import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpx extends ahbh implements ahcw
{
    public static final agpx a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)agpx.class, (ahbh)(a = new agpx()));
    }
    
    private agpx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agpx.d) == null) {
                    synchronized (agpx.class) {
                        if (agpx.d == null) {
                            agpx.d = (ahdd)new ahba((ahbh)agpx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agpx.a;
            }
            case 4: {
                return new ahaz((ahbh)agpx.a);
            }
            case 3: {
                return new agpx();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpx.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "b", "c" });
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
