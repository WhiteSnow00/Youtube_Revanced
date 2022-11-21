import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrb extends ahcz implements aheo
{
    public static final agrb a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    
    static {
        ahcz.registerDefaultInstance(agrb.class, a = new agrb());
    }
    
    private agrb() {
        this.e = "";
        this.f = "";
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
                if ((g = agrb.g) == null) {
                    synchronized (agrb.class) {
                        if (agrb.g == null) {
                            agrb.g = (ahev)new ahcs((ahcz)agrb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agrb.a;
            }
            case 4: {
                return new ahcr((ahcz)agrb.a);
            }
            case 3: {
                return new agrb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrb.a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004\u0208\u0005\u0208", new Object[] { "b", "c", "d", "e", "f" });
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
