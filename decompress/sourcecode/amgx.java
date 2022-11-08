import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgx extends agzi implements ahax
{
    public static final amgx a;
    private static volatile ahbe c;
    public amgj b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgx.class, (agzi)(a = new amgx()));
    }
    
    private amgx() {
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
                final ahbe c;
                if ((c = amgx.c) == null) {
                    synchronized (amgx.class) {
                        if (amgx.c == null) {
                            amgx.c = (ahbe)new agzb((agzi)amgx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amgx.a;
            }
            case 4: {
                return new agza((agzi)amgx.a);
            }
            case 3: {
                return new amgx();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgx.a, "\u0001\u0001\u0000\u0001\ue309\u3ff2\ue309\u3ff2\u0001\u0000\u0000\u0001\ue309\u3ff2\u1409\u0000", new Object[] { "d", "b" });
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
