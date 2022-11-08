import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcj extends agzi implements ahax
{
    public static final apcj a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private anss h;
    private anss i;
    private ajsq j;
    private anss k;
    private ajsq l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(apcj.class, a = new apcj());
    }
    
    private apcj() {
        this.n = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apcj.b) == null) {
                    synchronized (apcj.class) {
                        if (apcj.b == null) {
                            apcj.b = (ahbe)new agzb((agzi)apcj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcj.a;
            }
            case 4: {
                return new agza((agzi)apcj.a);
            }
            case 3: {
                return new apcj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcj.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\n\u1409\n\u000b\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "l" });
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
