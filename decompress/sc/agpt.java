import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpt extends ahbh implements ahcw
{
    public static final agpt a;
    private static volatile ahdd d;
    public String b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)agpt.class, (ahbh)(a = new agpt()));
    }
    
    private agpt() {
        this.b = "";
        this.c = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agpt.d) == null) {
                    synchronized (agpt.class) {
                        if (agpt.d == null) {
                            agpt.d = (ahdd)new ahba((ahbh)agpt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agpt.a;
            }
            case 4: {
                return new ahaz((ahbh)agpt.a);
            }
            case 3: {
                return new agpt();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpt.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0208\u0003\u0208", new Object[] { "b", "c" });
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
