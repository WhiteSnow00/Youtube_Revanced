import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqb extends ahcz implements aheo
{
    public static final aqqb a;
    private static volatile ahev g;
    public int b;
    public Object c;
    public int d;
    public Object e;
    public String f;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(aqqb.class, a = new aqqb());
    }
    
    private aqqb() {
        this.b = 0;
        this.d = 0;
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
                if ((g = aqqb.g) == null) {
                    synchronized (aqqb.class) {
                        if (aqqb.g == null) {
                            aqqb.g = (ahev)new ahcs((ahcz)aqqb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqqb.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqb.a);
            }
            case 3: {
                return new aqqb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqb.a, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0001\u0005\u103c\u0000", new Object[] { "c", "b", "e", "d", "h", "f", aqpr.class, aqqa.class, aqpr.class, aqpq.class });
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
