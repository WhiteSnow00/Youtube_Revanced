import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipu extends ahcz implements aheo
{
    public static final aipu a;
    private static volatile ahev d;
    public aipt b;
    public aipf c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aipu.class, a = new aipu());
    }
    
    private aipu() {
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
                if ((d = aipu.d) == null) {
                    synchronized (aipu.class) {
                        if (aipu.d == null) {
                            aipu.d = (ahev)new ahcs((ahcz)aipu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aipu.a;
            }
            case 4: {
                return new ahcr((ahcz)aipu.a);
            }
            case 3: {
                return new aipu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipu.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "e", "b", "c" });
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
