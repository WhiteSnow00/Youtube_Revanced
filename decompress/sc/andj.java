import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andj extends ahbh implements ahcw
{
    public static final andj a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)andj.class, (ahbh)(a = new andj()));
    }
    
    private andj() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = andj.f) == null) {
                    synchronized (andj.class) {
                        if (andj.f == null) {
                            andj.f = (ahdd)new ahba((ahbh)andj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return andj.a;
            }
            case 4: {
                return new ahaz((ahbh)andj.a);
            }
            case 3: {
                return new andj();
            }
            case 2: {
                return newMessageInfo((MessageLite)andj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", anci.i, "e", anci.j });
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
