import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akty extends ahbh implements ahcw
{
    public static final akty a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)akty.class, (ahbh)(a = new akty()));
    }
    
    private akty() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akty.d) == null) {
                    synchronized (akty.class) {
                        if (akty.d == null) {
                            akty.d = (ahdd)new ahba((ahbh)akty.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akty.a;
            }
            case 4: {
                return new ahaz((ahbh)akty.a);
            }
            case 3: {
                return new akty();
            }
            case 2: {
                return newMessageInfo((MessageLite)akty.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anic.m });
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
