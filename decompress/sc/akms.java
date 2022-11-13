import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akms extends ahbh implements ahcw
{
    public static final akms a;
    private static volatile ahdd d;
    public String b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)akms.class, (ahbh)(a = new akms()));
    }
    
    private akms() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akms.d) == null) {
                    synchronized (akms.class) {
                        if (akms.d == null) {
                            akms.d = (ahdd)new ahba((ahbh)akms.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akms.a;
            }
            case 4: {
                return new ahaz((ahbh)akms.a);
            }
            case 3: {
                return new akms();
            }
            case 2: {
                return newMessageInfo((MessageLite)akms.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", anqj.t });
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
