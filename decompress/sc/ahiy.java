import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiy extends ahbh implements ahcw
{
    public static final ahiy a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahiy.class, (ahbh)(a = new ahiy()));
    }
    
    private ahiy() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahiy.e) == null) {
                    synchronized (ahiy.class) {
                        if (ahiy.e == null) {
                            ahiy.e = (ahdd)new ahba((ahbh)ahiy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahiy.a;
            }
            case 4: {
                return new ahaz((ahbh)ahiy.a);
            }
            case 3: {
                return new ahiy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
