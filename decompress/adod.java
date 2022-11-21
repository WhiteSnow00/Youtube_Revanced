import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adod extends ahcz implements aheo
{
    public static final adod a;
    private static volatile ahev i;
    public int b;
    public int c;
    public String d;
    public long e;
    public long f;
    public long g;
    public long h;
    
    static {
        ahcz.registerDefaultInstance(adod.class, a = new adod());
    }
    
    private adod() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = adod.i) == null) {
                    synchronized (adod.class) {
                        if (adod.i == null) {
                            adod.i = (ahev)new ahcs((ahcz)adod.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return adod.a;
            }
            case 4: {
                return new ahcr((ahcz)adod.a);
            }
            case 3: {
                return new adod();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adod.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1003\u0004\u0006\u1003\u0005", new Object[] { "b", "c", pfw.n, "d", "e", "f", "g", "h" });
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
