import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajye extends ahbh implements ahcw
{
    public static final ajye a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public String d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajye.class, (ahbh)(a = new ajye()));
    }
    
    private ajye() {
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
                if ((f = ajye.f) == null) {
                    synchronized (ajye.class) {
                        if (ajye.f == null) {
                            ajye.f = (ahdd)new ahba((ahbh)ajye.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajye.a;
            }
            case 4: {
                return new ahaz((ahbh)ajye.a);
            }
            case 3: {
                return new ajye();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajye.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
