import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvp extends ahbh implements ahcw
{
    public static final akvp a;
    private static volatile ahdd e;
    public akli b;
    public ahbx c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akvp.class, (ahbh)(a = new akvp()));
    }
    
    private akvp() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
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
                final ahdd e;
                if ((e = akvp.e) == null) {
                    synchronized (akvp.class) {
                        if (akvp.e == null) {
                            akvp.e = (ahdd)new ahba((ahbh)akvp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akvp.a;
            }
            case 4: {
                return new ahaz((ahbh)akvp.a);
            }
            case 3: {
                return new akvp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u041b", new Object[] { "f", "b", "c", amvt.class, "d", amux.class });
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
