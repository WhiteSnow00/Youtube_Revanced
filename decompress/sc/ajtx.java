import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajtx extends ahbh implements ahcw
{
    public static final ajtx a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public anuv d;
    public ahbx e;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajtx.class, (ahbh)(a = new ajtx()));
    }
    
    private ajtx() {
        this.h = 2;
        this.e = emptyProtobufList();
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
                final ahdd f;
                if ((f = ajtx.f) == null) {
                    synchronized (ajtx.class) {
                        if (ajtx.f == null) {
                            ajtx.f = (ahdd)new ahba((ahbh)ajtx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajtx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajtx.a);
            }
            case 3: {
                return new ajtx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajtx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b", new Object[] { "b", "c", "g", "d", "e", anuv.class });
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
