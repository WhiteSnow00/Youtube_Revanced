import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgp extends ahbh implements ahcw
{
    public static final akgp a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akgp.class, (ahbh)(a = new akgp()));
    }
    
    private akgp() {
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
                if ((d = akgp.d) == null) {
                    synchronized (akgp.class) {
                        if (akgp.d == null) {
                            akgp.d = (ahdd)new ahba((ahbh)akgp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgp.a;
            }
            case 4: {
                return new ahaz((ahbh)akgp.a);
            }
            case 3: {
                return new akgp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgp.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u041b", new Object[] { "e", "b", "c", akgn.class });
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
