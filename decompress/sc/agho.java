import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agho extends ahbh implements ahcw
{
    private static final agho a;
    private static volatile ahdd b;
    private String c;
    
    static {
        ahbh.registerDefaultInstance((Class)agho.class, (ahbh)(a = new agho()));
    }
    
    private agho() {
        this.c = "";
    }
    
    public static agho a() {
        return agho.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agho.b) == null) {
                    synchronized (agho.class) {
                        if (agho.b == null) {
                            agho.b = (ahdd)new ahba((ahbh)agho.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agho.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new agho();
            }
            case 2: {
                return newMessageInfo((MessageLite)agho.a, "\u0001\u0000", (Object[])null);
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