import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfm extends ahcz implements aheo
{
    public static final akfm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akfm.class, a = new akfm());
    }
    
    private akfm() {
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
                if ((b = akfm.b) == null) {
                    synchronized (akfm.class) {
                        if (akfm.b == null) {
                            akfm.b = (ahev)new ahcs((ahcz)akfm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfm.a;
            }
            case 4: {
                return new ahcr((ahcz)akfm.a);
            }
            case 3: {
                return new akfm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfm.a, "\u0001\u0000", null);
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
