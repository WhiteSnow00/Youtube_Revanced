import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfr extends ahcz implements aheo
{
    public static final akfr a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akfr.class, a = new akfr());
    }
    
    private akfr() {
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
                if ((b = akfr.b) == null) {
                    synchronized (akfr.class) {
                        if (akfr.b == null) {
                            akfr.b = (ahev)new ahcs((ahcz)akfr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfr.a;
            }
            case 4: {
                return new ahcr((ahcz)akfr.a);
            }
            case 3: {
                return new akfr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfr.a, "\u0001\u0000", null);
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
