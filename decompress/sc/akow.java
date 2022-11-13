import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akow extends ahbh implements ahcw
{
    public static final akow a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private ajvo f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akow.class, (ahbh)(a = new akow()));
    }
    
    private akow() {
        this.g = 2;
        this.c = emptyProtobufList();
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
                final ahdd d;
                if ((d = akow.d) == null) {
                    synchronized (akow.class) {
                        if (akow.d == null) {
                            akow.d = (ahdd)new ahba((ahbh)akow.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akow.a;
            }
            case 4: {
                return new ahaz((ahbh)akow.a);
            }
            case 3: {
                return new akow();
            }
            case 2: {
                return newMessageInfo((MessageLite)akow.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0309\u1409\u0001", new Object[] { "e", "b", "c", akot.class, "f" });
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
