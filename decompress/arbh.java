import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbh extends ahcz implements aheo
{
    public static final arbh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arbh.class, a = new arbh());
    }
    
    private arbh() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arbh.b) == null) {
                    synchronized (arbh.class) {
                        if (arbh.b == null) {
                            arbh.b = (ahev)new ahcs((ahcz)arbh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arbh.a;
            }
            case 4: {
                return new ahcr((ahcz)arbh.a);
            }
            case 3: {
                return new arbh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbh.a, "\u0001\u0000", null);
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
