import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfv extends ahbh implements ahcw
{
    public static final ajfv a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfv.class, (ahbh)(a = new ajfv()));
    }
    
    private ajfv() {
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
                if ((d = ajfv.d) == null) {
                    synchronized (ajfv.class) {
                        if (ajfv.d == null) {
                            ajfv.d = (ahdd)new ahba((ahbh)ajfv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfv.a);
            }
            case 3: {
                return new ajfv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
