import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprb extends ahcz implements aheo
{
    public static final aprb a;
    private static volatile ahev g;
    public int b;
    public String c;
    public apni d;
    public apni e;
    public String f;
    
    static {
        ahcz.registerDefaultInstance(aprb.class, a = new aprb());
    }
    
    private aprb() {
        this.c = "";
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
                if ((g = aprb.g) == null) {
                    synchronized (aprb.class) {
                        if (aprb.g == null) {
                            aprb.g = (ahev)new ahcs((ahcz)aprb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aprb.a;
            }
            case 4: {
                return new ahcr((ahcz)aprb.a);
            }
            case 3: {
                return new aprb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
