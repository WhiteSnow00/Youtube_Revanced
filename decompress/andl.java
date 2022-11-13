import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andl extends ahbh implements ahcw
{
    public static final andl a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)andl.class, (ahbh)(a = new andl()));
    }
    
    private andl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = andl.g) == null) {
                    synchronized (andl.class) {
                        if (andl.g == null) {
                            andl.g = (ahdd)new ahba((ahbh)andl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return andl.a;
            }
            case 4: {
                return new ahaz((ahbh)andl.a);
            }
            case 3: {
                return new andl();
            }
            case 2: {
                return newMessageInfo((MessageLite)andl.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002\u1007\u0001\u0004\u1004\u0002\u0005\u1004\u0003\u0006\u1007\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
