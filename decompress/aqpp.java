import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpp extends ahcz implements aheo
{
    public static final aqpp a;
    private static volatile ahev f;
    public int b;
    public double c;
    public int d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(aqpp.class, a = new aqpp());
    }
    
    private aqpp() {
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqpp.f) == null) {
                    synchronized (aqpp.class) {
                        if (aqpp.f == null) {
                            aqpp.f = (ahev)new ahcs((ahcz)aqpp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpp.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpp.a);
            }
            case 3: {
                return new aqpp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u100b\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
