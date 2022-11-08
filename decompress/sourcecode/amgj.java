import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgj extends agzi implements ahax
{
    public static final amgj a;
    private static volatile ahbe i;
    public int b;
    public amgg c;
    public amgg d;
    public amgl e;
    public amgg f;
    public ajsq g;
    public amgg h;
    private amgi j;
    private amgg k;
    private anss l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)amgj.class, (agzi)(a = new amgj()));
    }
    
    private amgj() {
        this.m = 2;
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
                final ahbe i;
                if ((i = amgj.i) == null) {
                    synchronized (amgj.class) {
                        if (amgj.i == null) {
                            amgj.i = (ahbe)new agzb((agzi)amgj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amgj.a;
            }
            case 4: {
                return new agza((agzi)amgj.a);
            }
            case 3: {
                return new amgj();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgj.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "b", "j", "c", "k", "d", "e", "f", "l", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
