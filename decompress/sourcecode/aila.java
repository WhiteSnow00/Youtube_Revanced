import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aila extends agzi implements ahax
{
    public static final aila a;
    private static volatile ahbe m;
    public int b;
    public double c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public double j;
    public int k;
    public int l;
    
    static {
        agzi.registerDefaultInstance(aila.class, a = new aila());
    }
    
    private aila() {
        this.g = 1;
        this.h = 1;
        this.i = 1;
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
                if ((m = aila.m) == null) {
                    synchronized (aila.class) {
                        if (aila.m == null) {
                            aila.m = (ahbe)new agzb((agzi)aila.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aila.a;
            }
            case 4: {
                return new agza((agzi)aila.a);
            }
            case 3: {
                return new aila();
            }
            case 2: {
                final agzo l = akwf.l;
                final agzo k = akwf.k;
                return agzi.newMessageInfo((MessageLite)aila.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u100c\u0006\b\u1000\u0007\t\u100c\b\n\u1004\t", new Object[] { "b", "c", "d", "e", "f", "g", l, "h", k, "i", k, "j", "k", akwf.m, "l" });
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
