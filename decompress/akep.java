import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akep extends ahcz implements aheo
{
    private static final akep a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akep.class, a = new akep());
    }
    
    private akep() {
    }
    
    public static akep a() {
        return akep.a;
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
                if ((b = akep.b) == null) {
                    synchronized (akep.class) {
                        if (akep.b == null) {
                            akep.b = (ahev)new ahcs((ahcz)akep.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akep.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new akep();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akep.a, "\u0001\u0000", null);
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
