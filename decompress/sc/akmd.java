import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmd extends ahbh implements ahcw
{
    public static final akmd a;
    private static volatile ahdd h;
    public akli b;
    public ahbx c;
    public akmf d;
    public akmg e;
    public ahbx f;
    public ahab g;
    private int i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akmd.class, (ahbh)(a = new akmd()));
    }
    
    private akmd() {
        this.k = 2;
        this.c = emptyProtobufList();
        this.f = emptyProtobufList();
        emptyProtobufList();
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = akmd.h) == null) {
                    synchronized (akmd.class) {
                        if (akmd.h == null) {
                            akmd.h = (ahdd)new ahba((ahbh)akmd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akmd.a;
            }
            case 4: {
                return new ahaz((ahbh)akmd.a);
            }
            case 3: {
                return new akmd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmd.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0006\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0005\u1409\u0002\u0007\u1409\u0003\b\u100a\u0004\t\u041b", new Object[] { "i", "b", "c", akmb.class, "d", "e", "j", "g", "f", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
