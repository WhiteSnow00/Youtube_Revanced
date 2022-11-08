import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvq extends agzi implements ahax
{
    public static final fvq a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public String d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    
    static {
        agzi.registerDefaultInstance(fvq.class, a = new fvq());
    }
    
    private fvq() {
        this.c = "";
        this.d = "";
        this.g = -1L;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = fvq.i) == null) {
                    synchronized (fvq.class) {
                        if (fvq.i == null) {
                            fvq.i = (ahbe)new agzb((agzi)fvq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return fvq.a;
            }
            case 4: {
                return new agza((agzi)fvq.a);
            }
            case 3: {
                return new fvq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)fvq.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
