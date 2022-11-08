import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcx extends agzi implements ahax
{
    public static final apcx a;
    private static volatile ahbe b;
    private int c;
    private amfe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apcx.class, a = new apcx());
    }
    
    private apcx() {
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
                final ahbe b2;
                if ((b2 = apcx.b) == null) {
                    synchronized (apcx.class) {
                        if (apcx.b == null) {
                            apcx.b = (ahbe)new agzb((agzi)apcx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcx.a;
            }
            case 4: {
                return new agza((agzi)apcx.a);
            }
            case 3: {
                return new apcx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcx.a, "\u0001\u0001\u0000\u0001\ue592\u1be6\ue592\u1be6\u0001\u0000\u0000\u0001\ue592\u1be6\u1409\u0000", new Object[] { "c", "d" });
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
