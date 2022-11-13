import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkj extends ahbh implements ahcw
{
    public static final aqkj a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkj.class, (ahbh)(a = new aqkj()));
    }
    
    private aqkj() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqkj.g) == null) {
                    synchronized (aqkj.class) {
                        if (aqkj.g == null) {
                            aqkj.g = (ahdd)new ahba((ahbh)aqkj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqkj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkj.a);
            }
            case 3: {
                return new aqkj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkj.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u1008\u0001\u0002\u1004\u0002\u0004\u1007\u0004\u0006\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", aphr.q });
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
