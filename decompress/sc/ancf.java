import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancf extends ahbh implements ahcw
{
    public static final ancf a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ancf.class, (ahbh)(a = new ancf()));
    }
    
    private ancf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ancf.d) == null) {
                    synchronized (ancf.class) {
                        if (ancf.d == null) {
                            ancf.d = (ahdd)new ahba((ahbh)ancf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ancf.a;
            }
            case 4: {
                return new ahaz((ahbh)ancf.a);
            }
            case 3: {
                return new ancf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
