import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmr extends ahbh implements ahcw
{
    public static final akmr a;
    private static volatile ahdd e;
    public akli b;
    public int c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akmr.class, (ahbh)(a = new akmr()));
    }
    
    private akmr() {
        this.g = 2;
        this.d = emptyProtobufList();
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
                if ((e = akmr.e) == null) {
                    synchronized (akmr.class) {
                        if (akmr.e == null) {
                            akmr.e = (ahdd)new ahba((ahbh)akmr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akmr.a;
            }
            case 4: {
                return new ahaz((ahbh)akmr.a);
            }
            case 3: {
                return new akmr();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmr.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0003\u100c\u0001\u0005\u001b", new Object[] { "f", "b", "c", anqj.p, "d", akms.class });
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
