import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkd extends ahbh implements ahcw
{
    public static final amkd a;
    private static volatile ahdd f;
    public int b;
    public amka c;
    public amkb d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)amkd.class, (ahbh)(a = new amkd()));
    }
    
    private amkd() {
        this.g = 2;
        this.e = emptyProtobufList();
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
                if ((f = amkd.f) == null) {
                    synchronized (amkd.class) {
                        if (amkd.f == null) {
                            amkd.f = (ahdd)new ahba((ahbh)amkd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amkd.a;
            }
            case 4: {
                return new ahaz((ahbh)amkd.a);
            }
            case 3: {
                return new amkd();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", amki.class });
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
