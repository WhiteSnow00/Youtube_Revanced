import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsx extends ahcz implements aheo
{
    public static final apsx a;
    public static final ahcx b;
    public static final ahcx c;
    private static volatile ahev d;
    
    static {
        ahcz.registerDefaultInstance(apsx.class, a = new apsx());
        b = ahcz.newSingularGeneratedExtension((MessageLite)aptj.a, 0, null, null, 162410900, ahgc.e, Integer.class);
        c = ahcz.newSingularGeneratedExtension((MessageLite)aptj.a, false, null, null, 162000138, ahgc.h, Boolean.class);
    }
    
    private apsx() {
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
                if ((d = apsx.d) == null) {
                    synchronized (apsx.class) {
                        if (apsx.d == null) {
                            apsx.d = (ahev)new ahcs((ahcz)apsx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsx.a;
            }
            case 4: {
                return new ahcr((ahcz)apsx.a);
            }
            case 3: {
                return new apsx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsx.a, "\u0001\u0000", null);
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
