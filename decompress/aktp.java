import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktp extends ahbh implements ahcw
{
    public static final aktp a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aktp.class, (ahbh)(a = new aktp()));
    }
    
    private aktp() {
        this.c = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktp.d) == null) {
                    synchronized (aktp.class) {
                        if (aktp.d == null) {
                            aktp.d = (ahdd)new ahba((ahbh)aktp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktp.a;
            }
            case 4: {
                return new ahaz((ahbh)aktp.a);
            }
            case 3: {
                return new aktp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
