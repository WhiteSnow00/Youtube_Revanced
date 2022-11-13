import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyd extends ahbh implements ahcw
{
    public static final aoyd a;
    private static volatile ahdd e;
    public ajut b;
    public ajut c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyd.class, (ahbh)(a = new aoyd()));
    }
    
    private aoyd() {
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
                if ((e = aoyd.e) == null) {
                    synchronized (aoyd.class) {
                        if (aoyd.e == null) {
                            aoyd.e = (ahdd)new ahba((ahbh)aoyd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoyd.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyd.a);
            }
            case 3: {
                return new aoyd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b", new Object[] { "f", "b", "c", "d", anuv.class });
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
