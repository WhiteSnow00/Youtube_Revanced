import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amld extends ahbh implements ahcw
{
    public static final amld a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public anuv d;
    public anuv e;
    public ahbx f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)amld.class, (ahbh)(a = new amld()));
    }
    
    private amld() {
        this.j = 2;
        this.f = emptyProtobufList();
        this.g = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = amld.h) == null) {
                    synchronized (amld.class) {
                        if (amld.h == null) {
                            amld.h = (ahdd)new ahba((ahbh)amld.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amld.a;
            }
            case 4: {
                return new ahaz((ahbh)amld.a);
            }
            case 3: {
                return new amld();
            }
            case 2: {
                return newMessageInfo((MessageLite)amld.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001\u1409\u0003\u0002\u100a\u0004\u0003\u1409\u0000\u0005\u1409\u0001\u0006\u1409\u0002\u0007\u041b", new Object[] { "b", "i", "g", "c", "d", "e", "f", anuv.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
