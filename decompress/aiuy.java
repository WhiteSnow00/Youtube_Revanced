import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuy extends ahcz implements aheo
{
    public static final aiuy a;
    private static volatile ahev d;
    public int b;
    public aiux c;
    
    static {
        ahcz.registerDefaultInstance(aiuy.class, a = new aiuy());
    }
    
    private aiuy() {
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
                if ((d = aiuy.d) == null) {
                    synchronized (aiuy.class) {
                        if (aiuy.d == null) {
                            aiuy.d = (ahev)new ahcs((ahcz)aiuy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiuy.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuy.a);
            }
            case 3: {
                return new aiuy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuy.a, "\u0001\u0001\u0000\u0001\uf76b\u3b4e\uf76b\u3b4e\u0001\u0000\u0000\u0000\uf76b\u3b4e\u1009\u0000", new Object[] { "b", "c" });
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
