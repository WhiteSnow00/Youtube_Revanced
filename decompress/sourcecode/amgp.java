import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgp extends agzi implements ahax
{
    public static final amgp a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public akbf d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amgp.class, (agzi)(a = new amgp()));
    }
    
    private amgp() {
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
                if ((e = amgp.e) == null) {
                    synchronized (amgp.class) {
                        if (amgp.e == null) {
                            amgp.e = (ahbe)new agzb((agzi)amgp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amgp.a;
            }
            case 4: {
                return new agza((agzi)amgp.a);
            }
            case 3: {
                return new amgp();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
