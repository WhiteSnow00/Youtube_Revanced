import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcp extends ahbh implements ahcw
{
    public static final ajcp a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public String d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcp.class, (ahbh)(a = new ajcp()));
    }
    
    private ajcp() {
        this.g = 2;
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajcp.f) == null) {
                    synchronized (ajcp.class) {
                        if (ajcp.f == null) {
                            ajcp.f = (ahdd)new ahba((ahbh)ajcp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajcp.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcp.a);
            }
            case 3: {
                return new ajcp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
