import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpm extends ahcz implements aheo
{
    public static final aqpm a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public aqpz d;
    public aqpo e;
    
    static {
        ahcz.registerDefaultInstance(aqpm.class, a = new aqpm());
    }
    
    private aqpm() {
        this.c = ahcz.emptyProtobufList();
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
                if ((f = aqpm.f) == null) {
                    synchronized (aqpm.class) {
                        if (aqpm.f == null) {
                            aqpm.f = (ahev)new ahcs((ahcz)aqpm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpm.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpm.a);
            }
            case 3: {
                return new aqpm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpm.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0004\u1009\u0001", new Object[] { "b", "c", aqpn.class, "d", "e" });
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
