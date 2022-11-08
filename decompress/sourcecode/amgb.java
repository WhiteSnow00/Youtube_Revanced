import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgb extends agzi implements ahax
{
    public static final amgb a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public long d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amgb.class, (agzi)(a = new amgb()));
    }
    
    private amgb() {
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
                if ((e = amgb.e) == null) {
                    synchronized (amgb.class) {
                        if (amgb.e == null) {
                            amgb.e = (ahbe)new agzb((agzi)amgb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amgb.a;
            }
            case 4: {
                return new agza((agzi)amgb.a);
            }
            case 3: {
                return new amgb();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
