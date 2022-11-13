import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amku extends ahbh implements ahcw
{
    public static final amku a;
    private static volatile ahdd e;
    public String b;
    public long c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)amku.class, (ahbh)(a = new amku()));
    }
    
    private amku() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = amku.e) == null) {
                    synchronized (amku.class) {
                        if (amku.e == null) {
                            amku.e = (ahdd)new ahba((ahbh)amku.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amku.a;
            }
            case 4: {
                return new ahaz((ahbh)amku.a);
            }
            case 3: {
                return new amku();
            }
            case 2: {
                return newMessageInfo((MessageLite)amku.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
