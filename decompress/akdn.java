import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdn extends ahcz implements aheo
{
    public static final akdn a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akdn.class, a = new akdn());
    }
    
    private akdn() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = akdn.c) == null) {
                    synchronized (akdn.class) {
                        if (akdn.c == null) {
                            akdn.c = (ahev)new ahcs((ahcz)akdn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akdn.a;
            }
            case 4: {
                return new ahcr((ahcz)akdn.a);
            }
            case 3: {
                return new akdn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akan.l });
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
