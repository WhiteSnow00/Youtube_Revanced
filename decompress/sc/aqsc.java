import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsc extends ahbh implements ahcw
{
    public static final aqsc a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsc.class, (ahbh)(a = new aqsc()));
    }
    
    private aqsc() {
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
                if ((c = aqsc.c) == null) {
                    synchronized (aqsc.class) {
                        if (aqsc.c == null) {
                            aqsc.c = (ahdd)new ahba((ahbh)aqsc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqsc.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsc.a);
            }
            case 3: {
                return new aqsc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsc.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
