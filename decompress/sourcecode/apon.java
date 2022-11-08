import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apon extends agzi implements ahax
{
    public static final apon a;
    private static volatile ahbe e;
    public aorm b;
    public aorm c;
    public aorm d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)apon.class, (agzi)(a = new apon()));
    }
    
    private apon() {
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
                if ((e = apon.e) == null) {
                    synchronized (apon.class) {
                        if (apon.e == null) {
                            apon.e = (ahbe)new agzb((agzi)apon.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apon.a;
            }
            case 4: {
                return new agza((agzi)apon.a);
            }
            case 3: {
                return new apon();
            }
            case 2: {
                return newMessageInfo((MessageLite)apon.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
