import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxj extends ahbh implements ahcw
{
    public static final ajxj a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxj.class, (ahbh)(a = new ajxj()));
    }
    
    private ajxj() {
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
                if ((d = ajxj.d) == null) {
                    synchronized (ajxj.class) {
                        if (ajxj.d == null) {
                            ajxj.d = (ahdd)new ahba((ahbh)ajxj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxj.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxj.a);
            }
            case 3: {
                return new ajxj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
