import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpm extends ahbh implements ahcw
{
    public static final akpm a;
    private static volatile ahdd e;
    public akli b;
    public ahbx c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akpm.class, (ahbh)(a = new akpm()));
    }
    
    private akpm() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
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
                final ahdd e;
                if ((e = akpm.e) == null) {
                    synchronized (akpm.class) {
                        if (akpm.e == null) {
                            akpm.e = (ahdd)new ahba((ahbh)akpm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpm.a;
            }
            case 4: {
                return new ahaz((ahbh)akpm.a);
            }
            case 3: {
                return new akpm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpm.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0003\u0001\u1409\u0000\u0003\u041b\u0004\u041b", new Object[] { "f", "b", "c", akpi.class, "d", anuv.class });
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
