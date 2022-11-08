import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnc extends agzd implements agze
{
    public static final amnc a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aioe h;
    private aioe i;
    private anss j;
    private ahfw k;
    private anss m;
    private anss n;
    private anss o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)amnc.class, (agzi)(a = new amnc()));
    }
    
    private amnc() {
        this.p = 2;
        final agyc b = agyc.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = amnc.b) == null) {
                    synchronized (amnc.class) {
                        if (amnc.b == null) {
                            amnc.b = (ahbe)new agzb((agzi)amnc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amnc.a;
            }
            case 4: {
                return new agzc(amnc.a);
            }
            case 3: {
                return new amnc();
            }
            case 2: {
                return newMessageInfo((MessageLite)amnc.a, "\u0001\u000b\u0000\u0001\u0001\u0013\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\t\t\u1409\f\n\u1409\u0007\u000b\u1409\u0002\u000e\u1409\u000f\u0010\u1409\b\u0013\u1409\u0011", new Object[] { "c", "d", "f", "g", "h", "k", "m", "i", "e", "n", "j", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
