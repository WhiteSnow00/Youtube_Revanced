import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aina extends agzi implements ahax
{
    public static final aina a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private anss h;
    private aioe i;
    private aioe j;
    private ajsq k;
    private ajsq l;
    private aioe m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(aina.class, a = new aina());
    }
    
    private aina() {
        this.o = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = aina.b) == null) {
                    synchronized (aina.class) {
                        if (aina.b == null) {
                            aina.b = (ahbe)new agzb((agzi)aina.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aina.a;
            }
            case 4: {
                return new agza((agzi)aina.a);
            }
            case 3: {
                return new aina();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aina.a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002\u1409\f\u0004\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003\b\u1409\u0004\n\u1409\u0005\u000b\u1409\u0006\f\u1409\u0007\r\u1409\b\u000e\u1409\t\u000f\u1409\n", new Object[] { "c", "n", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}