import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzl extends ahcz implements aheo
{
    public static final akzl a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(akzl.class, a = new akzl());
    }
    
    private akzl() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akzl.d) == null) {
                    synchronized (akzl.class) {
                        if (akzl.d == null) {
                            akzl.d = (ahev)new ahcs((ahcz)akzl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzl.a;
            }
            case 4: {
                return new ahcr((ahcz)akzl.a);
            }
            case 3: {
                return new akzl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzl.a, "\u0001\u0002\u0001\u0000\uf4c9\u1a93\uf4b2\u2182\u0002\u0000\u0000\u0000\uf4c9\u1a93\u103c\u0000\uf4b2\u2182\u103c\u0000", new Object[] { "c", "b", anjs.class, anhx.class });
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
