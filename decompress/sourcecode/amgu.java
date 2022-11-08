import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgu extends agzi implements ahax
{
    public static final amgu a;
    private static volatile ahbe e;
    public int b;
    public amgv c;
    public amgt d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amgu.class, (agzi)(a = new amgu()));
    }
    
    private amgu() {
        this.f = 2;
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
                if ((e = amgu.e) == null) {
                    synchronized (amgu.class) {
                        if (amgu.e == null) {
                            amgu.e = (ahbe)new agzb((agzi)amgu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amgu.a;
            }
            case 4: {
                return new agza((agzi)amgu.a);
            }
            case 3: {
                return new amgu();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
