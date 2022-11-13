import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkf extends ahbh implements ahcw
{
    public static final amkf a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)amkf.class, (ahbh)(a = new amkf()));
    }
    
    private amkf() {
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
                final ahdd e;
                if ((e = amkf.e) == null) {
                    synchronized (amkf.class) {
                        if (amkf.e == null) {
                            amkf.e = (ahdd)new ahba((ahbh)amkf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amkf.a;
            }
            case 4: {
                return new ahaz((ahbh)amkf.a);
            }
            case 3: {
                return new amkf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkf.a, "\u0001\u0002\u0000\u0001\u0001\ufb21\u43ad\u0002\u0000\u0001\u0001\u0001\u100c\u0000\ufb21\u43ad\u041b", new Object[] { "b", "d", ameu.s, "c", amke.class });
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
