import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akeu extends ahcz implements aheo
{
    public static final akeu a;
    private static volatile ahev b;
    private ahej c;
    
    static {
        ahcz.registerDefaultInstance(akeu.class, a = new akeu());
    }
    
    private akeu() {
        this.c = ahej.a;
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
                if ((b = akeu.b) == null) {
                    synchronized (akeu.class) {
                        if (akeu.b == null) {
                            akeu.b = (ahev)new ahcs((ahcz)akeu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akeu.a;
            }
            case 4: {
                return new ahcr((ahcz)akeu.a);
            }
            case 3: {
                return new akeu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akeu.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aket.a });
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
