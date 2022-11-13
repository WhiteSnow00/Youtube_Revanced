import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajue extends ahbh implements ahcw
{
    public static final ajue a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajue.class, (ahbh)(a = new ajue()));
    }
    
    private ajue() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajue.e) == null) {
                    synchronized (ajue.class) {
                        if (ajue.e == null) {
                            ajue.e = (ahdd)new ahba((ahbh)ajue.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajue.a;
            }
            case 4: {
                return new ahaz((ahbh)ajue.a);
            }
            case 3: {
                return new ajue();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajue.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
