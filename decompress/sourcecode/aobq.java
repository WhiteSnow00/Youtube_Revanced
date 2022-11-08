import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobq extends agzi implements ahax
{
    public static final aobq a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private amer f;
    private anss g;
    private ahfw h;
    private aioe i;
    private ajsq j;
    private aioe k;
    private aioe l;
    private anss m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(aobq.class, a = new aobq());
    }
    
    private aobq() {
        this.n = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = aobq.b) == null) {
                    synchronized (aobq.class) {
                        if (aobq.b == null) {
                            aobq.b = (ahbe)new agzb((agzi)aobq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aobq.a;
            }
            case 4: {
                return new agza((agzi)aobq.a);
            }
            case 3: {
                return new aobq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobq.a, "\u0001\n\u0000\u0001\u0001\u0016\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0002\t\u1409\u0004\u000b\u1409\u0006\r\u1409\b\u000e\u1409\t\u0012\u1409\r\u0015\u1409\u0003\u0016\u1409\f", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "m", "g", "l" });
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
