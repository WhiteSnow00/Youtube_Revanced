import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxo extends ahbh implements ahcw
{
    public static final anxo a;
    private static volatile ahdd g;
    public String b;
    public boolean c;
    public String d;
    public boolean e;
    public String f;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)anxo.class, (ahbh)(a = new anxo()));
    }
    
    private anxo() {
        this.b = "";
        this.d = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anxo.g) == null) {
                    synchronized (anxo.class) {
                        if (anxo.g == null) {
                            anxo.g = (ahdd)new ahba((ahbh)anxo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anxo.a;
            }
            case 4: {
                return new ahaz((ahbh)anxo.a);
            }
            case 3: {
                return new anxo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxo.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0006\u1008\u0005", new Object[] { "h", "b", "c", "d", "e", "f" });
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
