import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqid extends ahcz implements aheo
{
    public static final aqid a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aqid.class, a = new aqid());
    }
    
    private aqid() {
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
                if ((d = aqid.d) == null) {
                    synchronized (aqid.class) {
                        if (aqid.d == null) {
                            aqid.d = (ahev)new ahcs((ahcz)aqid.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqid.a;
            }
            case 4: {
                return new ahcr((ahcz)aqid.a);
            }
            case 3: {
                return new aqid();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqid.a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u1034\u0000\u0003\u103b\u0000\u0004\u103a\u0000\u0005\u103d\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u1037\u0000\t\u103e\u0000", new Object[] { "c", "b", aqdx.m, aqic.class, aqhx.class });
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
