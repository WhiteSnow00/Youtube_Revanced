import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfp extends ahcz implements aheo
{
    public static final akfp a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akfp.class, a = new akfp());
    }
    
    private akfp() {
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
                if ((b = akfp.b) == null) {
                    synchronized (akfp.class) {
                        if (akfp.b == null) {
                            akfp.b = (ahev)new ahcs((ahcz)akfp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfp.a;
            }
            case 4: {
                return new ahcr((ahcz)akfp.a);
            }
            case 3: {
                return new akfp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfp.a, "\u0001\u0000", null);
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
