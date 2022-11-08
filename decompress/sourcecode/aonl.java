import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonl extends agzi implements ahax
{
    public static final aonl a;
    private static volatile ahbe g;
    public int b;
    public aong c;
    public aomx d;
    public aonb e;
    public aomz f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aonl.class, (agzi)(a = new aonl()));
    }
    
    private aonl() {
        this.h = 2;
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
                final ahbe g;
                if ((g = aonl.g) == null) {
                    synchronized (aonl.class) {
                        if (aonl.g == null) {
                            aonl.g = (ahbe)new agzb((agzi)aonl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aonl.a;
            }
            case 4: {
                return new agza((agzi)aonl.a);
            }
            case 3: {
                return new aonl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonl.a, "\u0001\u0004\u0000\u0001\ue55e\u2847\ue628\u5819\u0004\u0000\u0000\u0004\ue55e\u2847\u1409\u0000\ue1c5\u367b\u1409\u0001\uf6b6\u48e7\u1409\u0002\ue628\u5819\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
