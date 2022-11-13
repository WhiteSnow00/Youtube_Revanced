import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annt extends ahbh implements ahcw
{
    public static final annt a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)annt.class, (ahbh)(a = new annt()));
    }
    
    private annt() {
        this.e = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = annt.b) == null) {
                    synchronized (annt.class) {
                        if (annt.b == null) {
                            annt.b = (ahdd)new ahba((ahbh)annt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annt.a;
            }
            case 4: {
                return new ahaz((ahbh)annt.a);
            }
            case 3: {
                return new annt();
            }
            case 2: {
                return newMessageInfo((MessageLite)annt.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
