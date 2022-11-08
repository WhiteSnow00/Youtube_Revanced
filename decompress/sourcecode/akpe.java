import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpe extends agzi implements ahax
{
    public static final akpe a;
    private static volatile ahbe i;
    public int b;
    public akjf c;
    public agzy d;
    public agyc e;
    public ahzp f;
    public ansn g;
    public agzy h;
    private akpg j;
    private ahfw k;
    private ajtl l;
    private anss m;
    private anss n;
    private anss o;
    private aioe p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(akpe.class, a = new akpe());
    }
    
    private akpe() {
        this.q = 2;
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
        this.e = agyc.b;
        emptyProtobufList();
        this.h = agzi.emptyProtobufList();
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
                final ahbe i;
                if ((i = akpe.i) == null) {
                    synchronized (akpe.class) {
                        if (akpe.i == null) {
                            akpe.i = (ahbe)new agzb((agzi)akpe.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akpe.a;
            }
            case 4: {
                return new agza((byte[][])null, (byte[][])null);
            }
            case 3: {
                return new akpe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpe.a, "\u0001\r\u0000\u0001\u0001\u0309\r\u0000\u0002\f\u0001\u1409\u0000\u0004\u041b\u0005\u100a\u0004\n\u1409\u0002\u000b\u1409\u0003\r\u1409\b\u000e\u1409\t\u000f\u1409\u000b\u0010\u1409\f\u0011\u041b\u0012\u1409\r\u0013\u1409\n\u0309\u1409\u0007", new Object[] { "b", "c", "d", akpf.class, "e", "j", "k", "m", "f", "n", "o", "h", ahtd.class, "p", "g", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
