import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoih extends ahbh implements ahcw
{
    public static final aoih a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aoih.class, (ahbh)(a = new aoih()));
    }
    
    private aoih() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aoih.d) == null) {
                    synchronized (aoih.class) {
                        if (aoih.d == null) {
                            aoih.d = (ahdd)new ahba((ahbh)aoih.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoih.a;
            }
            case 4: {
                return new ahaz((ahbh)aoih.a);
            }
            case 3: {
                return new aoih();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoih.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
