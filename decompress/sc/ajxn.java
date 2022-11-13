import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxn extends ahbh implements ahcw
{
    public static final ajxn a;
    private static volatile ahdd f;
    public double b;
    public double c;
    public String d;
    public String e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxn.class, (ahbh)(a = new ajxn()));
    }
    
    private ajxn() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajxn.f) == null) {
                    synchronized (ajxn.class) {
                        if (ajxn.f == null) {
                            ajxn.f = (ahdd)new ahba((ahbh)ajxn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajxn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxn.a);
            }
            case 3: {
                return new ajxn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
