import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldl extends ahbh implements ahcw
{
    public static final aldl a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aldl.class, (ahbh)(a = new aldl()));
    }
    
    private aldl() {
        this.e = 2;
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aldl.d) == null) {
                    synchronized (aldl.class) {
                        if (aldl.d == null) {
                            aldl.d = (ahdd)new ahba((ahbh)aldl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aldl.a;
            }
            case 4: {
                return new ahaz((ahbh)aldl.a);
            }
            case 3: {
                return new aldl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}