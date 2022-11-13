import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akos extends ahbh implements ahcw
{
    public static final akos a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akos.class, (ahbh)(a = new akos()));
    }
    
    private akos() {
        this.f = 2;
        this.c = emptyProtobufList();
        emptyProtobufList();
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
                if ((d = akos.d) == null) {
                    synchronized (akos.class) {
                        if (akos.d == null) {
                            akos.d = (ahdd)new ahba((ahbh)akos.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akos.a;
            }
            case 4: {
                return new ahaz((ahbh)akos.a);
            }
            case 3: {
                return new akos();
            }
            case 2: {
                return newMessageInfo((MessageLite)akos.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", ahwr.class });
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
