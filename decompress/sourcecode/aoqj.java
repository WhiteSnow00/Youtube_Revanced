import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqj extends agzi implements ahax
{
    public static final aoqj a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public int i;
    
    static {
        agzi.registerDefaultInstance(aoqj.class, a = new aoqj());
    }
    
    private aoqj() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = aoqj.j) == null) {
                    synchronized (aoqj.class) {
                        if (aoqj.j == null) {
                            aoqj.j = (ahbe)new agzb((agzi)aoqj.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aoqj.a;
            }
            case 4: {
                return new agza((agzi)aoqj.a);
            }
            case 3: {
                return new aoqj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqj.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1004\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
