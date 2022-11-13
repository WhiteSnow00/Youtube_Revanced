import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akol extends ahbh implements ahcw
{
    public static final akol a;
    private static volatile ahdd h;
    public int b;
    public akli c;
    public ajut d;
    public akoj e;
    public akoo f;
    public ahbx g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akol.class, (ahbh)(a = new akol()));
    }
    
    private akol() {
        this.i = 2;
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = akol.h) == null) {
                    synchronized (akol.class) {
                        if (akol.h == null) {
                            akol.h = (ahdd)new ahba((ahbh)akol.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akol.a;
            }
            case 4: {
                return new ahaz((ahbh)akol.a);
            }
            case 3: {
                return new akol();
            }
            case 2: {
                return newMessageInfo((MessageLite)akol.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u041b", new Object[] { "b", "c", "d", "e", "f", "g", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
