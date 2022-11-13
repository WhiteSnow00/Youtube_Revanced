import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgq extends ahbh implements ahcw
{
    public static final akgq a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)akgq.class, (ahbh)(a = new akgq()));
    }
    
    private akgq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akgq.d) == null) {
                    synchronized (akgq.class) {
                        if (akgq.d == null) {
                            akgq.d = (ahdd)new ahba((ahbh)akgq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgq.a;
            }
            case 4: {
                return new ahaz((ahbh)akgq.a);
            }
            case 3: {
                return new akgq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
