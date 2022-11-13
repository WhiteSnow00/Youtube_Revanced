import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojl extends ahbh implements ahcw
{
    public static final aojl a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public anuv d;
    public anuv e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aojl.class, (ahbh)(a = new aojl()));
    }
    
    private aojl() {
        this.g = 2;
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
                if ((f = aojl.f) == null) {
                    synchronized (aojl.class) {
                        if (aojl.f == null) {
                            aojl.f = (ahdd)new ahba((ahbh)aojl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojl.a;
            }
            case 4: {
                return new ahaz((ahbh)aojl.a);
            }
            case 3: {
                return new aojl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0001", new Object[] { "b", "c", "e", "d" });
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
