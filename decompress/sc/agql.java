import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agql extends ahbh implements ahcw
{
    public static final agql a;
    private static volatile ahdd d;
    public agqi b;
    public agpu c;
    
    static {
        ahbh.registerDefaultInstance((Class)agql.class, (ahbh)(a = new agql()));
    }
    
    private agql() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agql.d) == null) {
                    synchronized (agql.class) {
                        if (agql.d == null) {
                            agql.d = (ahdd)new ahba((ahbh)agql.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agql.a;
            }
            case 4: {
                return new ahaz((ahbh)agql.a);
            }
            case 3: {
                return new agql();
            }
            case 2: {
                return newMessageInfo((MessageLite)agql.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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
