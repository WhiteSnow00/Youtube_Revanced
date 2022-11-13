import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwm extends ahbh implements ahcw
{
    public static final anwm a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)anwm.class, (ahbh)(a = new anwm()));
    }
    
    private anwm() {
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
                if ((d = anwm.d) == null) {
                    synchronized (anwm.class) {
                        if (anwm.d == null) {
                            anwm.d = (ahdd)new ahba((ahbh)anwm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwm.a;
            }
            case 4: {
                return new ahaz((ahbh)anwm.a);
            }
            case 3: {
                return new anwm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
