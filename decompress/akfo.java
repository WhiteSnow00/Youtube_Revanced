import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfo extends ahcz implements aheo
{
    public static final akfo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akfo.class, a = new akfo());
    }
    
    private akfo() {
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
                if ((b = akfo.b) == null) {
                    synchronized (akfo.class) {
                        if (akfo.b == null) {
                            akfo.b = (ahev)new ahcs((ahcz)akfo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfo.a;
            }
            case 4: {
                return new ahcr((ahcz)akfo.a);
            }
            case 3: {
                return new akfo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfo.a, "\u0001\u0000", null);
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
