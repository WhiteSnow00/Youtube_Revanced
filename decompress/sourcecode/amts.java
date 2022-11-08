import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amts extends agzi implements ahax
{
    public static final amts a;
    private static volatile ahbe e;
    public akjf b;
    public boolean c;
    public long d;
    private int f;
    private ajtl g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amts.class, a = new amts());
    }
    
    private amts() {
        this.h = 2;
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
                if ((e = amts.e) == null) {
                    synchronized (amts.class) {
                        if (amts.e == null) {
                            amts.e = (ahbe)new agzb((agzi)amts.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amts.a;
            }
            case 4: {
                return new agza((agzi)amts.a);
            }
            case 3: {
                return new amts();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amts.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0003\u1002\u0002\u0309\u1409\u0003", new Object[] { "f", "b", "c", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
