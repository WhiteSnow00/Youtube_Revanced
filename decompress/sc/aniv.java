import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniv extends ahbh implements ahcw
{
    public static final aniv a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ahbx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aniv.class, (ahbh)(a = new aniv()));
    }
    
    private aniv() {
        this.f = 2;
        this.d = emptyProtobufList();
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
                if ((e = aniv.e) == null) {
                    synchronized (aniv.class) {
                        if (aniv.e == null) {
                            aniv.e = (ahdd)new ahba((ahbh)aniv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aniv.a;
            }
            case 4: {
                return new ahaz((ahbh)aniv.a);
            }
            case 3: {
                return new aniv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aniv.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002\u1409\u0001\u0003\u041b", new Object[] { "b", "c", "d", aniu.class });
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
