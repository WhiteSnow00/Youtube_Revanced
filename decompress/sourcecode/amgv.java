import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgv extends agzi implements ahax
{
    public static final amgv a;
    private static volatile ahbe d;
    public int b;
    public amhf c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgv.class, (agzi)(a = new amgv()));
    }
    
    private amgv() {
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
                if ((d = amgv.d) == null) {
                    synchronized (amgv.class) {
                        if (amgv.d == null) {
                            amgv.d = (ahbe)new agzb((agzi)amgv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amgv.a;
            }
            case 4: {
                return new agza((agzi)amgv.a);
            }
            case 3: {
                return new amgv();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgv.a, "\u0001\u0001\u0000\u0001\uf574\u3c15\uf574\u3c15\u0001\u0000\u0000\u0001\uf574\u3c15\u1409\u0000", new Object[] { "b", "c" });
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
