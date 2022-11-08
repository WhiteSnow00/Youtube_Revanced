import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoow extends agzi implements ahax
{
    public static final aoow a;
    private static volatile ahbe s;
    public boolean b;
    public boolean c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    private int t;
    
    static {
        agzi.registerDefaultInstance((Class)aoow.class, (agzi)(a = new aoow()));
    }
    
    private aoow() {
        this.d = 1.0f;
        agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe s;
                if ((s = aoow.s) == null) {
                    synchronized (aoow.class) {
                        if (aoow.s == null) {
                            aoow.s = (ahbe)new agzb((agzi)aoow.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aoow.a;
            }
            case 4: {
                return new agza((agzi)aoow.a);
            }
            case 3: {
                return new aoow();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoow.a, "\u0001\u0011\u0000\u0001\u0001\u0016\u0011\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0005\u0003\u1007\u0006\u0004\u1004\u0007\u0005\u1007\u0001\u0006\u1007\u0003\u0007\u1001\u0002\b\u1007\b\n\u1007\t\u000b\u1007\u000b\f\u1007\u000e\r\u1007\u000f\u0010\u1007\n\u0011\u1007\u0011\u0012\u1004\u0012\u0013\u1007\f\u0016\u1007\u0014", new Object[] { "t", "b", "f", "g", "h", "c", "e", "d", "i", "j", "l", "n", "o", "k", "p", "q", "m", "r" });
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
