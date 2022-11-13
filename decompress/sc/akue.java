import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akue extends ahbh implements ahcw
{
    public static final akue a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)akue.class, (ahbh)(a = new akue()));
    }
    
    private akue() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akue.d) == null) {
                    synchronized (akue.class) {
                        if (akue.d == null) {
                            akue.d = (ahdd)new ahba((ahbh)akue.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akue.a;
            }
            case 4: {
                return new ahaz((ahbh)akue.a);
            }
            case 3: {
                return new akue();
            }
            case 2: {
                return newMessageInfo((MessageLite)akue.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
