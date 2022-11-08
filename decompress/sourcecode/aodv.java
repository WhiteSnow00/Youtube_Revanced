import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodv extends agzi implements ahax
{
    public static final aodv a;
    private static volatile ahbe d;
    public int b;
    public aiva c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aodv.class, a = new aodv());
    }
    
    private aodv() {
        this.e = 2;
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
                final ahbe d;
                if ((d = aodv.d) == null) {
                    synchronized (aodv.class) {
                        if (aodv.d == null) {
                            aodv.d = (ahbe)new agzb((agzi)aodv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aodv.a;
            }
            case 4: {
                return new agza((agzi)aodv.a);
            }
            case 3: {
                return new aodv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodv.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "b", "c" });
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
