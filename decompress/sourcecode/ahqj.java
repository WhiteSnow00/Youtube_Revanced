import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqj extends agzi implements ahax
{
    public static final ahqj a;
    private static volatile ahbe m;
    public float b;
    public float c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private int n;
    private int o;
    
    static {
        agzi.registerDefaultInstance(ahqj.class, a = new ahqj());
    }
    
    private ahqj() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = ahqj.m) == null) {
                    synchronized (ahqj.class) {
                        if (ahqj.m == null) {
                            ahqj.m = (ahbe)new agzb((agzi)ahqj.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ahqj.a;
            }
            case 4: {
                return new agza((agzi)ahqj.a);
            }
            case 3: {
                return new ahqj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqj.a, "\u0001\u000b\u0000\u0002\u0005&\u000b\u0000\u0000\u0000\u0005\u1007\u0007\u000f\u1001\u0004\u0010\u1007\r\u0011\u1007\u000e\u0012\u1001\u000f\u0014\u1001\u0005\u0016\u1007\u0012\u001d\u1007\u0018\"\u1007\u001f$\u1007\u001e&\u1007!", new Object[] { "n", "o", "d", "b", "e", "f", "g", "c", "h", "i", "k", "j", "l" });
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
