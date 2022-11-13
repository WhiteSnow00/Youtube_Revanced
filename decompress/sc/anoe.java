import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anoe extends ahbh implements ahcw
{
    public static final anoe a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)anoe.class, (ahbh)(a = new anoe()));
    }
    
    private anoe() {
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
                if ((g = anoe.g) == null) {
                    synchronized (anoe.class) {
                        if (anoe.g == null) {
                            anoe.g = (ahdd)new ahba((ahbh)anoe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anoe.a;
            }
            case 4: {
                return new ahaz((ahbh)anoe.a);
            }
            case 3: {
                return new anoe();
            }
            case 2: {
                return newMessageInfo((MessageLite)anoe.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
