import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktj extends ahbh implements ahcw
{
    public static final aktj a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aktj.class, (ahbh)(a = new aktj()));
    }
    
    private aktj() {
        this.f = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktj.d) == null) {
                    synchronized (aktj.class) {
                        if (aktj.d == null) {
                            aktj.d = (ahdd)new ahba((ahbh)aktj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktj.a;
            }
            case 4: {
                return new ahaz((ahbh)aktj.a);
            }
            case 3: {
                return new aktj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktj.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u041b", new Object[] { "e", "b", "c", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
