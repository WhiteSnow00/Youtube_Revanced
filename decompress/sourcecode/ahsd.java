import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsd extends agzi implements ahax
{
    public static final ahsd a;
    private static volatile ahbe r;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public long i;
    public boolean j;
    public long k;
    public int l;
    public boolean m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    private int s;
    
    static {
        agzi.registerDefaultInstance(ahsd.class, a = new ahsd());
    }
    
    private ahsd() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe r;
                if ((r = ahsd.r) == null) {
                    synchronized (ahsd.class) {
                        if (ahsd.r == null) {
                            ahsd.r = (ahbe)new agzb((agzi)ahsd.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return ahsd.a;
            }
            case 4: {
                return new agza((agzi)ahsd.a);
            }
            case 3: {
                return new ahsd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsd.a, "\u0001\u0010\u0000\u0001\u0002\u001f\u0010\u0000\u0000\u0000\u0002\u1002\u0001\u0005\u1002\u0006\u0006\u1007\r\u0007\u1002\u000e\b\u1002\u000b\u000b\u100c\u0014\u0010\u1004\b\u0012\u1002\u0005\u0013\u1007\u0013\u0014\u1002\u0003\u0015\u1004\t\u0016\u1002\u0004\u0017\u1007\u0017\u001c\u1004\u000f\u001e\u1004\u001d\u001f\u1007\u001e", new Object[] { "s", "b", "f", "j", "k", "i", "n", ahse.a, "g", "e", "m", "c", "h", "d", "o", "l", "p", "q" });
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
