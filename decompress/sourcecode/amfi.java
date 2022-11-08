import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfi extends agzi implements ahax
{
    public static final amfi a;
    private static volatile ahbe e;
    public aorm b;
    public int c;
    public int d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)amfi.class, (agzi)(a = new amfi()));
    }
    
    private amfi() {
        this.g = 2;
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
                final ahbe e;
                if ((e = amfi.e) == null) {
                    synchronized (amfi.class) {
                        if (amfi.e == null) {
                            amfi.e = (ahbe)new agzb((agzi)amfi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amfi.a;
            }
            case 4: {
                return new agza((agzi)amfi.a);
            }
            case 3: {
                return new amfi();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
