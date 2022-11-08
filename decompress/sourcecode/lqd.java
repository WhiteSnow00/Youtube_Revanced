import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqd extends agzi implements ahax
{
    public static final lqd a;
    private static volatile ahbe k;
    public int b;
    public lqb c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    
    static {
        agzi.registerDefaultInstance(lqd.class, a = new lqd());
    }
    
    private lqd() {
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
                if ((k = lqd.k) == null) {
                    synchronized (lqd.class) {
                        if (lqd.k == null) {
                            lqd.k = (ahbe)new agzb((agzi)lqd.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return lqd.a;
            }
            case 4: {
                return new agza((agzi)lqd.a);
            }
            case 3: {
                return new lqd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lqd.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1007\u0001\u0004\u1007\u0002\u0005\u1007\u0003\u0006\u1007\u0004\u0007\u1007\u0005\t\u1007\u0006\n\u1007\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
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
