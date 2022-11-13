import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpj extends ahbh implements ahcw
{
    public static final agpj a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    
    static {
        ahbh.registerDefaultInstance((Class)agpj.class, (ahbh)(a = new agpj()));
    }
    
    private agpj() {
        this.e = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = agpj.g) == null) {
                    synchronized (agpj.class) {
                        if (agpj.g == null) {
                            agpj.g = (ahdd)new ahba((ahbh)agpj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agpj.a;
            }
            case 4: {
                return new ahaz((ahbh)agpj.a);
            }
            case 3: {
                return new agpj();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpj.a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004\u0208\u0005\u0208", new Object[] { "b", "c", "d", "e", "f" });
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
