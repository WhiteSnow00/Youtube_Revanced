import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albo extends ahbh implements ahcw
{
    public static final albo a;
    private static volatile ahdd f;
    public int b;
    public akli c;
    public ahbx d;
    public anuv e;
    private aiqj g;
    private ajvo h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)albo.class, (ahbh)(a = new albo()));
    }
    
    private albo() {
        this.i = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = albo.f) == null) {
                    synchronized (albo.class) {
                        if (albo.f == null) {
                            albo.f = (ahdd)new ahba((ahbh)albo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return albo.a;
            }
            case 4: {
                return new ahaz((ahbh)albo.a);
            }
            case 3: {
                return new albo();
            }
            case 2: {
                return newMessageInfo((MessageLite)albo.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0005\u1409\u0002\u0309\u1409\u0003", new Object[] { "b", "c", "d", anuv.class, "g", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
