import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpv extends ahcz implements aheo
{
    public static final aqpv a;
    private static volatile ahev h;
    public ahdp b;
    public aqpl c;
    public aqps d;
    public aqpz e;
    public ahdp f;
    public ahdp g;
    private int i;
    
    static {
        ahcz.registerDefaultInstance(aqpv.class, a = new aqpv());
    }
    
    private aqpv() {
        this.b = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqpv.h) == null) {
                    synchronized (aqpv.class) {
                        if (aqpv.h == null) {
                            aqpv.h = (ahev)new ahcs((ahcz)aqpv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqpv.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpv.a);
            }
            case 3: {
                return new aqpv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpv.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1009\u0001\u0004\u1009\u0002\b\u001b\t\u001b", new Object[] { "i", "b", aqpw.class, "c", "d", "e", "g", aqpt.class, "f", aqpu.class });
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
