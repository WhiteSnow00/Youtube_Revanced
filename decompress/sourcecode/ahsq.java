import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsq extends agzi implements ahax
{
    public static final ahsq a;
    private static volatile ahbe k;
    public int b;
    public long c;
    public agzy d;
    public long e;
    public long f;
    public long g;
    public agzy h;
    public long i;
    public long j;
    
    static {
        agzi.registerDefaultInstance(ahsq.class, a = new ahsq());
    }
    
    private ahsq() {
        this.d = agzi.emptyProtobufList();
        this.h = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = ahsq.k) == null) {
                    synchronized (ahsq.class) {
                        if (ahsq.k == null) {
                            ahsq.k = (ahbe)new agzb((agzi)ahsq.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ahsq.a;
            }
            case 4: {
                return new agza((int[])null, (char[][][])null);
            }
            case 3: {
                return new ahsq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsq.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u001b\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u0006\u001b\u0007\u1002\u0004\b\u1002\u0005", new Object[] { "b", "c", "d", ahsp.class, "e", "f", "g", "h", ahsp.class, "i", "j" });
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
