import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adof extends ahcz implements aheo
{
    public static final adof a;
    private static volatile ahev l;
    public double b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public double i;
    public int j;
    public int k;
    private int m;
    
    static {
        ahcz.registerDefaultInstance(adof.class, a = new adof());
    }
    
    private adof() {
        this.f = 1;
        this.g = 1;
        this.h = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = adof.l) == null) {
                    synchronized (adof.class) {
                        if (adof.l == null) {
                            adof.l = (ahev)new ahcs((ahcz)adof.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return adof.a;
            }
            case 4: {
                return new ahcr((ahcz)adof.a);
            }
            case 3: {
                return new adof();
            }
            case 2: {
                final ahdf m = akyi.m;
                final ahdf i = akyi.l;
                return ahcz.newMessageInfo((MessageLite)adof.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u100c\u0006\b\u1000\u0007\t\u100c\b\n\u1004\t", new Object[] { "m", "b", "c", "d", "e", "f", m, "g", i, "h", i, "i", "j", akyi.n, "k" });
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
