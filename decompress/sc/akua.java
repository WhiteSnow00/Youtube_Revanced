import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akua extends ahbh implements ahcw
{
    public static final akua a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)akua.class, (ahbh)(a = new akua()));
    }
    
    private akua() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akua.d) == null) {
                    synchronized (akua.class) {
                        if (akua.d == null) {
                            akua.d = (ahdd)new ahba((ahbh)akua.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akua.a;
            }
            case 4: {
                return new ahaz((ahbh)akua.a);
            }
            case 3: {
                return new akua();
            }
            case 2: {
                return newMessageInfo((MessageLite)akua.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
