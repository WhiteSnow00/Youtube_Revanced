import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsy extends ahcz implements aheo
{
    public static final apsy a;
    public static final ahcx b;
    public static final ahcx c;
    private static volatile ahev d;
    
    static {
        ahcz.registerDefaultInstance(apsy.class, a = new apsy());
        b = ahcz.newSingularGeneratedExtension((MessageLite)apud.a, 0, null, null, 153514762, ahgc.e, Integer.class);
        c = ahcz.newSingularGeneratedExtension((MessageLite)apud.a, false, null, null, 167027722, ahgc.h, Boolean.class);
    }
    
    private apsy() {
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
                if ((d = apsy.d) == null) {
                    synchronized (apsy.class) {
                        if (apsy.d == null) {
                            apsy.d = (ahev)new ahcs((ahcz)apsy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsy.a;
            }
            case 4: {
                return new ahcr((ahcz)apsy.a);
            }
            case 3: {
                return new apsy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsy.a, "\u0001\u0000", null);
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
