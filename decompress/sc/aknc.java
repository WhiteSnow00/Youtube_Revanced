import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknc extends ahbh implements ahcw
{
    public static final aknc a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aknc.class, (ahbh)(a = new aknc()));
    }
    
    private aknc() {
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
                if ((d = aknc.d) == null) {
                    synchronized (aknc.class) {
                        if (aknc.d == null) {
                            aknc.d = (ahdd)new ahba((ahbh)aknc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aknc.a;
            }
            case 4: {
                return new ahaz((ahbh)aknc.a);
            }
            case 3: {
                return new aknc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", aknd.class });
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
