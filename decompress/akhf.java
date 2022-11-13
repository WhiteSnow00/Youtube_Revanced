import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhf extends ahbh implements ahcw
{
    public static final akhf a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akhf.class, (ahbh)(a = new akhf()));
    }
    
    private akhf() {
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
                if ((c = akhf.c) == null) {
                    synchronized (akhf.class) {
                        if (akhf.c == null) {
                            akhf.c = (ahdd)new ahba((ahbh)akhf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akhf.a;
            }
            case 4: {
                return new ahaz((ahbh)akhf.a);
            }
            case 3: {
                return new akhf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
