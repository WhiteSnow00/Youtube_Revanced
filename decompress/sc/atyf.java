import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyf extends ahbh implements ahcw
{
    public static final atyf a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public long d;
    public long e;
    public long f;
    
    static {
        ahbh.registerDefaultInstance((Class)atyf.class, (ahbh)(a = new atyf()));
    }
    
    private atyf() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = atyf.g) == null) {
                    synchronized (atyf.class) {
                        if (atyf.g == null) {
                            atyf.g = (ahdd)new ahba((ahbh)atyf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return atyf.a;
            }
            case 4: {
                return new ahaz((ahbh)atyf.a);
            }
            case 3: {
                return new atyf();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
