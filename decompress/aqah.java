import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqah extends ahcz implements aheo
{
    public static final aqah a;
    private static volatile ahev g;
    public long b;
    public String c;
    public long d;
    public long e;
    public long f;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(aqah.class, a = new aqah());
    }
    
    private aqah() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqah.g) == null) {
                    synchronized (aqah.class) {
                        if (aqah.g == null) {
                            aqah.g = (ahev)new ahcs((ahcz)aqah.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqah.a;
            }
            case 4: {
                return new ahcr((ahcz)aqah.a);
            }
            case 3: {
                return new aqah();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqah.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1002\u0003\u0005\u1002\u0004", new Object[] { "h", "b", "c", "d", "e", "f" });
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
