import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfq extends ahcz implements aheo
{
    public static final akfq a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akfq.class, a = new akfq());
    }
    
    private akfq() {
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
                if ((b = akfq.b) == null) {
                    synchronized (akfq.class) {
                        if (akfq.b == null) {
                            akfq.b = (ahev)new ahcs((ahcz)akfq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfq.a;
            }
            case 4: {
                return new ahcr((ahcz)akfq.a);
            }
            case 3: {
                return new akfq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfq.a, "\u0001\u0000", null);
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
