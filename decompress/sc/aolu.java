import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolu extends ahbh implements ahcw
{
    public static final aolu a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)aolu.class, (ahbh)(a = new aolu()));
    }
    
    private aolu() {
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
                if ((g = aolu.g) == null) {
                    synchronized (aolu.class) {
                        if (aolu.g == null) {
                            aolu.g = (ahdd)new ahba((ahbh)aolu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aolu.a;
            }
            case 4: {
                return new ahaz((ahbh)aolu.a);
            }
            case 3: {
                return new aolu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", aluv.a(), "e", "f" });
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
