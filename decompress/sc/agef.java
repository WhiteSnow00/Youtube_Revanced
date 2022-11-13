import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agef extends ahbh implements ahcw
{
    public static final agef a;
    private static volatile ahdd d;
    public int b;
    public ahab c;
    
    static {
        ahbh.registerDefaultInstance((Class)agef.class, (ahbh)(a = new agef()));
    }
    
    private agef() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agef.d) == null) {
                    synchronized (agef.class) {
                        if (agef.d == null) {
                            agef.d = (ahdd)new ahba((ahbh)agef.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agef.a;
            }
            case 4: {
                return new ahaz((ahbh)agef.a);
            }
            case 3: {
                return new agef();
            }
            case 2: {
                return newMessageInfo((MessageLite)agef.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "b", "c" });
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
