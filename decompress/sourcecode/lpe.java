import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpe extends agzi implements ahax
{
    public static final lpe a;
    private static volatile ahbe m;
    public int b;
    public int c;
    public String d;
    public int e;
    public long f;
    public String g;
    public long h;
    public int i;
    public boolean j;
    public long k;
    public long l;
    
    static {
        agzi.registerDefaultInstance(lpe.class, a = new lpe());
    }
    
    private lpe() {
        this.d = "";
        this.g = "";
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
                if ((m = lpe.m) == null) {
                    synchronized (lpe.class) {
                        if (lpe.m == null) {
                            lpe.m = (ahbe)new agzb((agzi)lpe.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return lpe.a;
            }
            case 4: {
                return new agza((agzi)lpe.a);
            }
            case 3: {
                return new lpe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpe.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1003\u0003\u0005\u1008\u0004\u0006\u1002\u0005\u0007\u100c\u0007\b\u1007\b\t\u1002\t\n\u1002\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ehk.m, "j", "k", "l" });
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
