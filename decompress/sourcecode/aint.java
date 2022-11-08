import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aint extends agzi implements ahax
{
    public static final aint a;
    private static volatile ahbe k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    
    static {
        agzi.registerDefaultInstance(aint.class, a = new aint());
    }
    
    private aint() {
        this.c = 1;
        this.d = 1;
        this.e = 1;
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
                if ((k = aint.k) == null) {
                    synchronized (aint.class) {
                        if (aint.k == null) {
                            aint.k = (ahbe)new agzb((agzi)aint.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aint.a;
            }
            case 4: {
                return new agza((agzi)aint.a);
            }
            case 3: {
                return new aint();
            }
            case 2: {
                final agzo n = aijn.n;
                final agzo o3 = aijn.o;
                return agzi.newMessageInfo((MessageLite)aint.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1007\u0003\u0004\u1007\u0004\u0005\u100b\u0005\u0006\u100b\u0006\u0007\u1007\u0007\b\u100c\u0002", new Object[] { "b", "c", n, "d", o3, "f", "g", "h", "i", "j", "e", o3 });
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
