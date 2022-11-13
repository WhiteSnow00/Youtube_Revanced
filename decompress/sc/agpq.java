import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpq extends ahbh implements ahcw
{
    public static final agpq a;
    private static volatile ahdd f;
    public agqi b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)agpq.class, (ahbh)(a = new agpq()));
    }
    
    private agpq() {
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agpq.f) == null) {
                    synchronized (agpq.class) {
                        if (agpq.f == null) {
                            agpq.f = (ahdd)new ahba((ahbh)agpq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agpq.a;
            }
            case 4: {
                return new ahaz((ahbh)agpq.a);
            }
            case 3: {
                return new agpq();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpq.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002\u0208\u0004\u0208\u0005\u0208", new Object[] { "b", "c", "d", "e" });
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
