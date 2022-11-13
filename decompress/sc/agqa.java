import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqa extends ahbh implements ahcw
{
    public static final agqa a;
    private static volatile ahdd c;
    public String b;
    
    static {
        ahbh.registerDefaultInstance((Class)agqa.class, (ahbh)(a = new agqa()));
    }
    
    private agqa() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agqa.c) == null) {
                    synchronized (agqa.class) {
                        if (agqa.c == null) {
                            agqa.c = (ahdd)new ahba((ahbh)agqa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqa.a;
            }
            case 4: {
                return new ahaz((ahbh)agqa.a);
            }
            case 3: {
                return new agqa();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqa.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
