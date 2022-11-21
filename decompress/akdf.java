import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdf extends ahcz implements aheo
{
    public static final akdf a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        final akdf a2 = new akdf();
        ahcz.registerDefaultInstance(akdf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 398047497, ahgc.k, akdf.class);
    }
    
    private akdf() {
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
                if ((c = akdf.c) == null) {
                    synchronized (akdf.class) {
                        if (akdf.c == null) {
                            akdf.c = (ahev)new ahcs((ahcz)akdf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akdf.a;
            }
            case 4: {
                return new ahcr((ahcz)akdf.a);
            }
            case 3: {
                return new akdf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdf.a, "\u0001\u0000", null);
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
