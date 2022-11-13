import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajci extends ahbh implements ahcw
{
    public static final ajci a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajci.class, (ahbh)(a = new ajci()));
    }
    
    private ajci() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajci.c) == null) {
                    synchronized (ajci.class) {
                        if (ajci.c == null) {
                            ajci.c = (ahdd)new ahba((ahbh)ajci.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajci.a;
            }
            case 4: {
                return new ahaz((ahbh)ajci.a);
            }
            case 3: {
                return new ajci();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajci.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
