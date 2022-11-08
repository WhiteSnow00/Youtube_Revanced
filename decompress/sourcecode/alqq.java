import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqq extends agzi implements ahax
{
    public static final alqq a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    
    static {
        agzi.registerDefaultInstance(alqq.class, a = new alqq());
    }
    
    private alqq() {
        this.c = "";
        this.d = "";
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
                if ((j = alqq.j) == null) {
                    synchronized (alqq.class) {
                        if (alqq.j == null) {
                            alqq.j = (ahbe)new agzb((agzi)alqq.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alqq.a;
            }
            case 4: {
                return new agza((agzi)alqq.a);
            }
            case 3: {
                return new alqq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqq.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\u1002\u0003\u0002\u1002\u0005\u0004\u1008\u0001\u0005\u1008\u0002\u0007\u1002\u0006\b\u1002\u0007\t\u1002\b", new Object[] { "b", "e", "f", "c", "d", "g", "h", "i" });
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
