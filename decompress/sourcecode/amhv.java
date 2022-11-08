import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhv extends agzi implements ahax
{
    public static final amhv a;
    private static volatile ahbe b;
    private int c;
    private amhu d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amhv.class, (agzi)(a = new amhv()));
    }
    
    private amhv() {
        this.e = 2;
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = amhv.b) == null) {
                    synchronized (amhv.class) {
                        if (amhv.b == null) {
                            amhv.b = (ahbe)new agzb((agzi)amhv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amhv.a;
            }
            case 4: {
                return new agza((agzi)amhv.a);
            }
            case 3: {
                return new amhv();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
