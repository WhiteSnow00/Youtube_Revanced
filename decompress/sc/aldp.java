import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldp extends ahbh implements ahcw
{
    public static final aldp a;
    private static volatile ahdd f;
    public int b;
    public akli c;
    public aiqj d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aldp.class, (ahbh)(a = new aldp()));
    }
    
    private aldp() {
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
                if ((f = aldp.f) == null) {
                    synchronized (aldp.class) {
                        if (aldp.f == null) {
                            aldp.f = (ahdd)new ahba((ahbh)aldp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aldp.a;
            }
            case 4: {
                return new ahaz((ahbh)aldp.a);
            }
            case 3: {
                return new aldp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldp.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u001b", new Object[] { "b", "c", "d", "e", aldn.class });
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
