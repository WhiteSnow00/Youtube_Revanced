import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrf extends ahbh implements ahcw
{
    public static final agrf a;
    private static volatile ahdd j;
    public int b;
    public String c;
    public int d;
    public ahdy e;
    public ahdy f;
    public agrh g;
    public agrc h;
    public agre i;
    
    static {
        ahbh.registerDefaultInstance((Class)agrf.class, (ahbh)(a = new agrf()));
    }
    
    private agrf() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = agrf.j) == null) {
                    synchronized (agrf.class) {
                        if (agrf.j == null) {
                            agrf.j = (ahdd)new ahba((ahbh)agrf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agrf.a;
            }
            case 4: {
                return new ahaz((ahbh)agrf.a);
            }
            case 3: {
                return new agrf();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrf.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u100c\u0001\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1009\u0004\u0005\u1009\u0005\u0007\u1008\u0000\b\u1009\u0007", new Object[] { "b", "d", agrd.b(), "e", "f", "g", "h", "c", "i" });
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
