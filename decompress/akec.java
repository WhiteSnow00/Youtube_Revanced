import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akec extends ahcz implements aheo
{
    public static final akec a;
    public static final ahcx b;
    public static final ahcx c;
    private static volatile ahev d;
    
    static {
        ahcz.registerDefaultInstance(akec.class, a = new akec());
        b = ahcz.newSingularGeneratedExtension((MessageLite)akeg.a, false, null, null, 177622921, ahgc.h, Boolean.class);
        c = ahcz.newSingularGeneratedExtension((MessageLite)akeg.a, 0, null, null, 274703452, ahgc.e, Integer.class);
    }
    
    private akec() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akec.d) == null) {
                    synchronized (akec.class) {
                        if (akec.d == null) {
                            akec.d = (ahev)new ahcs((ahcz)akec.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akec.a;
            }
            case 4: {
                return new ahcr((ahcz)akec.a);
            }
            case 3: {
                return new akec();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akec.a, "\u0001\u0000", null);
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
