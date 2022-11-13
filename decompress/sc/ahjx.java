import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjx extends ahbh implements ahcw
{
    public static final ahjx a;
    private static volatile ahdd g;
    public int b;
    public ahbx c;
    public ahbx d;
    public anuv e;
    public ajmr f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjx.class, (ahbh)(a = new ahjx()));
    }
    
    private ahjx() {
        this.h = 2;
        this.c = emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd g;
                if ((g = ahjx.g) == null) {
                    synchronized (ahjx.class) {
                        if (ahjx.g == null) {
                            ahjx.g = (ahdd)new ahba((ahbh)ahjx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahjx.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjx.a);
            }
            case 3: {
                return new ahjx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjx.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0003\u0001\u041b\u0004\u041b\u0005\u1409\u0000\u0006\u1009\u0002", new Object[] { "b", "c", ahjw.class, "d", ahjv.class, "e", "f" });
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
