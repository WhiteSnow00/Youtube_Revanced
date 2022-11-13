import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcx extends ahbh implements ahcw
{
    public static final alcx a;
    private static volatile ahdd e;
    public akli b;
    public ahbx c;
    public ahbx d;
    private int f;
    private ajvo g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alcx.class, (ahbh)(a = new alcx()));
    }
    
    private alcx() {
        this.h = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = alcx.e) == null) {
                    synchronized (alcx.class) {
                        if (alcx.e == null) {
                            alcx.e = (ahdd)new ahba((ahbh)alcx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alcx.a;
            }
            case 4: {
                return new ahaz((ahbh)alcx.a);
            }
            case 3: {
                return new alcx();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcx.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0002\u0004\u0001\u1409\u0000\u0003\u041b\u0004\u041b\u0309\u1409\u0001", new Object[] { "f", "b", "c", alde.class, "d", anuu.class, "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
