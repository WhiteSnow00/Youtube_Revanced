import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldj extends ahbh implements ahcw
{
    public static final aldj a;
    private static volatile ahdd d;
    public akli b;
    public anuv c;
    private int e;
    private ajvo f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aldj.class, (ahbh)(a = new aldj()));
    }
    
    private aldj() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aldj.d) == null) {
                    synchronized (aldj.class) {
                        if (aldj.d == null) {
                            aldj.d = (ahdd)new ahba((ahbh)aldj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aldj.a;
            }
            case 4: {
                return new ahaz((ahbh)aldj.a);
            }
            case 3: {
                return new aldj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldj.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
