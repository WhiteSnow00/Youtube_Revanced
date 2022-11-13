import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprv extends ahbh implements ahcw
{
    public static final aprv a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aprv.class, (ahbh)(a = new aprv()));
    }
    
    private aprv() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = aprv.b) == null) {
                    synchronized (aprv.class) {
                        if (aprv.b == null) {
                            aprv.b = (ahdd)new ahba((ahbh)aprv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprv.a;
            }
            case 4: {
                return new ahaz((ahbh)aprv.a);
            }
            case 3: {
                return new aprv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprv.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0000", new Object[] { "c", "d" });
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
