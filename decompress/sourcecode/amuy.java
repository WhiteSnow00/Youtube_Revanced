import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuy extends agzi implements ahax
{
    public static final amuy a;
    private static volatile ahbe e;
    public int b;
    public ajcz c;
    public apgl d;
    private aiva f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(amuy.class, a = new amuy());
    }
    
    private amuy() {
        this.g = 2;
    }
    
    @Override
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
                if ((e = amuy.e) == null) {
                    synchronized (amuy.class) {
                        if (amuy.e == null) {
                            amuy.e = (ahbe)new agzb((agzi)amuy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amuy.a;
            }
            case 4: {
                return new agza((agzi)amuy.a);
            }
            case 3: {
                return new amuy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amuy.a, "\u0001\u0003\u0000\u0001\ufc43\u196f\ue607\u2a05\u0003\u0000\u0000\u0003\ufc43\u196f\u1409\u0000\uf321\u1e90\u1409\u0002\ue607\u2a05\u1409\u0001", new Object[] { "b", "c", "f", "d" });
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
