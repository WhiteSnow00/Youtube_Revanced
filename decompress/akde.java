import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akde extends ahcz implements aheo
{
    public static final akde a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        final akde a2 = new akde();
        ahcz.registerDefaultInstance(akde.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 448363122, ahgc.k, akde.class);
    }
    
    private akde() {
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
                if ((c = akde.c) == null) {
                    synchronized (akde.class) {
                        if (akde.c == null) {
                            akde.c = (ahev)new ahcs((ahcz)akde.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akde.a;
            }
            case 4: {
                return new ahcr((ahcz)akde.a);
            }
            case 3: {
                return new akde();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akde.a, "\u0001\u0000", null);
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
