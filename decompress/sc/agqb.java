import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqb extends ahbh implements ahcw
{
    public static final agqb a;
    private static volatile ahdd d;
    public String b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)agqb.class, (ahbh)(a = new agqb()));
    }
    
    private agqb() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agqb.d) == null) {
                    synchronized (agqb.class) {
                        if (agqb.d == null) {
                            agqb.d = (ahdd)new ahba((ahbh)agqb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqb.a;
            }
            case 4: {
                return new ahaz((ahbh)agqb.a);
            }
            case 3: {
                return new agqb();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqb.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "b", "c" });
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
