import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agps extends ahbh implements ahcw
{
    public static final agps a;
    private static volatile ahdd c;
    public String b;
    
    static {
        ahbh.registerDefaultInstance((Class)agps.class, (ahbh)(a = new agps()));
    }
    
    private agps() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agps.c) == null) {
                    synchronized (agps.class) {
                        if (agps.c == null) {
                            agps.c = (ahdd)new ahba((ahbh)agps.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agps.a;
            }
            case 4: {
                return new ahaz((ahbh)agps.a);
            }
            case 3: {
                return new agps();
            }
            case 2: {
                return newMessageInfo((MessageLite)agps.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", new Object[] { "b" });
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
