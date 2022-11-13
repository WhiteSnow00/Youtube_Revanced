import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwe extends ahbh implements ahcw
{
    public static final ajwe a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwe.class, (ahbh)(a = new ajwe()));
    }
    
    private ajwe() {
        this.c = "";
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
                if ((f = ajwe.f) == null) {
                    synchronized (ajwe.class) {
                        if (ajwe.f == null) {
                            ajwe.f = (ahdd)new ahba((ahbh)ajwe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajwe.a;
            }
            case 4: {
                return new ahaz((boolean[][])null, (boolean[][])null);
            }
            case 3: {
                return new ajwe();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwe.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
