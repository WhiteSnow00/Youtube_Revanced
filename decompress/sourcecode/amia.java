import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amia extends agzi implements ahax
{
    public static final amia a;
    private static volatile ahbe d;
    public int b;
    public amhz c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amia.class, (agzi)(a = new amia()));
    }
    
    private amia() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amia.d) == null) {
                    synchronized (amia.class) {
                        if (amia.d == null) {
                            amia.d = (ahbe)new agzb((agzi)amia.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amia.a;
            }
            case 4: {
                return new agza((agzi)amia.a);
            }
            case 3: {
                return new amia();
            }
            case 2: {
                return newMessageInfo((MessageLite)amia.a, "\u0001\u0001\u0000\u0001\uff27\u43ad\uff27\u43ad\u0001\u0000\u0000\u0001\uff27\u43ad\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
