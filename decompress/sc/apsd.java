import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsd extends ahbh implements ahcw
{
    public static final apsd a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)apsd.class, (ahbh)(a = new apsd()));
    }
    
    private apsd() {
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
                if ((d = apsd.d) == null) {
                    synchronized (apsd.class) {
                        if (apsd.d == null) {
                            apsd.d = (ahdd)new ahba((ahbh)apsd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsd.a;
            }
            case 4: {
                return new ahaz((ahbh)apsd.a);
            }
            case 3: {
                return new apsd();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
