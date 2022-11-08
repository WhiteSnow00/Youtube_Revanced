import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhr extends agzi implements ahax
{
    public static final amhr a;
    private static volatile ahbe b;
    private int c;
    private amhv d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amhr.class, (agzi)(a = new amhr()));
    }
    
    private amhr() {
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
                final ahbe b2;
                if ((b2 = amhr.b) == null) {
                    synchronized (amhr.class) {
                        if (amhr.b == null) {
                            amhr.b = (ahbe)new agzb((agzi)amhr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amhr.a;
            }
            case 4: {
                return new agza((agzi)amhr.a);
            }
            case 3: {
                return new amhr();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhr.a, "\u0001\u0001\u0000\u0001\ufb1d\u4447\ufb1d\u4447\u0001\u0000\u0000\u0001\ufb1d\u4447\u1409\u0000", new Object[] { "c", "d" });
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
