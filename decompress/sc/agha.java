import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agha extends ahbh implements ahcw
{
    public static final agha a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)agha.class, (ahbh)(a = new agha()));
    }
    
    private agha() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agha.d) == null) {
                    synchronized (agha.class) {
                        if (agha.d == null) {
                            agha.d = (ahdd)new ahba((ahbh)agha.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agha.a;
            }
            case 4: {
                return new ahaz((ahbh)agha.a);
            }
            case 3: {
                return new agha();
            }
            case 2: {
                return newMessageInfo((MessageLite)agha.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", aggz.class, aggy.class });
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
