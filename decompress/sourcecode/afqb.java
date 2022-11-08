import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqb extends agzi implements ahax
{
    public static final afqb a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    private ahez f;
    private ahfc g;
    private ahfh h;
    private ahfd i;
    private ahfb j;
    private ahfe k;
    private ahey l;
    private ahfa m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(afqb.class, a = new afqb());
    }
    
    private afqb() {
        this.n = 2;
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
                if ((b2 = afqb.b) == null) {
                    synchronized (afqb.class) {
                        if (afqb.b == null) {
                            afqb.b = (ahbe)new agzb((agzi)afqb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return afqb.a;
            }
            case 4: {
                return new agza((agzi)afqb.a);
            }
            case 3: {
                return new afqb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afqb.a, "\u0001\b\u0000\u0003\u0016S\b\u0000\u0000\b\u0016\u1409\u0015!\u1409)0\u14097=\u1409\u0016M\u1409QO\u1409(Q\u1409TS\u1409V", new Object[] { "c", "d", "e", "f", "i", "j", "g", "k", "h", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
