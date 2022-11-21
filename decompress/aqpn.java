import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpn extends ahcz implements aheo
{
    public static final aqpn a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(aqpn.class, a = new aqpn());
    }
    
    private aqpn() {
        this.c = "";
        this.d = "";
        this.e = ahcz.emptyProtobufList();
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
                if ((f = aqpn.f) == null) {
                    synchronized (aqpn.class) {
                        if (aqpn.f == null) {
                            aqpn.f = (ahev)new ahcs((ahcz)aqpn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpn.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpn.a);
            }
            case 3: {
                return new aqpn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", aqpp.class });
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
