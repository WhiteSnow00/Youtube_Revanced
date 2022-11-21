import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqie extends ahcz implements aheo
{
    public static final aqie a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        final aqie a2 = new aqie();
        ahcz.registerDefaultInstance(aqie.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 158796327, ahgc.k, aqie.class);
    }
    
    private aqie() {
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
                if ((c = aqie.c) == null) {
                    synchronized (aqie.class) {
                        if (aqie.c == null) {
                            aqie.c = (ahev)new ahcs((ahcz)aqie.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqie.a;
            }
            case 4: {
                return new ahcr((ahcz)aqie.a);
            }
            case 3: {
                return new aqie();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqie.a, "\u0001\u0000", null);
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
