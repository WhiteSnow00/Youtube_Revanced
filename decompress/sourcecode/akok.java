import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akok extends agzi implements ahax
{
    public static final akok a;
    private static volatile ahbe p;
    public int b;
    public akjf c;
    public anrc d;
    public akve e;
    public aioe f;
    public aioe g;
    public int h;
    public agyc i;
    public int j;
    public aioe k;
    public String l;
    public anss m;
    public agzy n;
    public anss o;
    private ahfw q;
    private ajtl r;
    private anss s;
    private byte t;
    
    static {
        agzi.registerDefaultInstance(akok.class, a = new akok());
    }
    
    private akok() {
        this.t = 2;
        this.i = agyc.b;
        this.l = "";
        this.n = agzi.emptyProtobufList();
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
                final ahbe p3;
                if ((p3 = akok.p) == null) {
                    synchronized (akok.class) {
                        if (akok.p == null) {
                            akok.p = (ahbe)new agzb((agzi)akok.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return akok.a;
            }
            case 4: {
                return new agza((agzi)akok.a);
            }
            case 3: {
                return new akok();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akok.a, "\u0001\u0010\u0000\u0001\u0001\u0309\u0010\u0000\u0001\f\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u100c\u0005\t\u1409\u0007\n\u100a\b\f\u100c\n\r\u1409\f\u000e\u1008\r\u000f\u1409\u000e\u0010\u1409\u000f\u0011\u041b\u0012\u1409\u0010\u0309\u1409\u000b", new Object[] { "b", "c", "d", "e", "f", "g", "h", anoo.q, "q", "i", "j", anqf.a(), "k", "l", "s", "m", "n", ajnh.class, "o", "r" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.t = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
