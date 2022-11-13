import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvb extends ahbh implements ahcw
{
    public static final ajvb a;
    private static volatile ahdd f;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvb.class, (ahbh)(a = new ajvb()));
    }
    
    private ajvb() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajvb.f) == null) {
                    synchronized (ajvb.class) {
                        if (ajvb.f == null) {
                            ajvb.f = (ahdd)new ahba((ahbh)ajvb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajvb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvb.a);
            }
            case 3: {
                return new ajvb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
