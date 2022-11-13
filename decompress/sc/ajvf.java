import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvf extends ahbh implements ahcw
{
    public static final ajvf a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvf.class, (ahbh)(a = new ajvf()));
    }
    
    private ajvf() {
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
                if ((d = ajvf.d) == null) {
                    synchronized (ajvf.class) {
                        if (ajvf.d == null) {
                            ajvf.d = (ahdd)new ahba((ahbh)ajvf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvf.a);
            }
            case 3: {
                return new ajvf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
