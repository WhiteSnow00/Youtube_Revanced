import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpx extends agzi implements ahax
{
    public static final ahpx a;
    private static volatile ahbe b;
    private int c;
    private ahpw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahpx.class, a = new ahpx());
    }
    
    private ahpx() {
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
                if ((b2 = ahpx.b) == null) {
                    synchronized (ahpx.class) {
                        if (ahpx.b == null) {
                            ahpx.b = (ahbe)new agzb((agzi)ahpx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpx.a;
            }
            case 4: {
                return new agza((agzi)ahpx.a);
            }
            case 3: {
                return new ahpx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpx.a, "\u0001\u0001\u0000\u0001\uf5a0\u4037\uf5a0\u4037\u0001\u0000\u0000\u0001\uf5a0\u4037\u1409\u0000", new Object[] { "c", "d" });
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
