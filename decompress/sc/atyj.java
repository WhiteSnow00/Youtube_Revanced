import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyj extends ahbh implements ahcw
{
    public static final atyj a;
    private static volatile ahdd f;
    public int b;
    public long c;
    public boolean d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)atyj.class, (ahbh)(a = new atyj()));
    }
    
    private atyj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = atyj.f) == null) {
                    synchronized (atyj.class) {
                        if (atyj.f == null) {
                            atyj.f = (ahdd)new ahba((ahbh)atyj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atyj.a;
            }
            case 4: {
                return new ahaz((ahbh)atyj.a);
            }
            case 3: {
                return new atyj();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
