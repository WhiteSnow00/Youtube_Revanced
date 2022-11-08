import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsm extends agzi implements ahax
{
    public static final ahsm a;
    private static volatile ahbe t;
    public int b;
    public boolean c;
    public int d;
    public String e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public aitx p;
    public long q;
    public ahsq r;
    public agzy s;
    
    static {
        agzi.registerDefaultInstance(ahsm.class, a = new ahsm());
    }
    
    private ahsm() {
        this.e = "";
        emptyProtobufList();
        this.s = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe t;
                if ((t = ahsm.t) == null) {
                    synchronized (ahsm.class) {
                        if (ahsm.t == null) {
                            ahsm.t = (ahbe)new agzb((agzi)ahsm.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return ahsm.a;
            }
            case 4: {
                return new agza((char[][])null, (float[][])null);
            }
            case 3: {
                return new ahsm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsm.a, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1002\b\n\u1002\t\u000b\u1002\n\f\u1002\u000b\r\u1004\f\u000e\u1009\r\u0010\u1002\u000e\u0011\u1009\u000f\u0012\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", ahso.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
