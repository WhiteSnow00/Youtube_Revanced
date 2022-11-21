import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaj extends ahcz implements aheo
{
    public static final aqaj a;
    public static final ahcx b;
    public static final ahcx c;
    public static final ahcx d;
    private static volatile ahev e;
    
    static {
        ahcz.registerDefaultInstance(aqaj.class, a = new aqaj());
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqai.a, false, null, null, 1000, ahgc.h, Boolean.class);
        c = ahcz.newSingularGeneratedExtension((MessageLite)aqai.a, 0L, null, null, 1001, ahgc.c, Long.class);
        d = ahcz.newSingularGeneratedExtension((MessageLite)aqai.a, "", null, null, 1002, ahgc.i, String.class);
    }
    
    private aqaj() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqaj.e) == null) {
                    synchronized (aqaj.class) {
                        if (aqaj.e == null) {
                            aqaj.e = (ahev)new ahcs((ahcz)aqaj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqaj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqaj.a);
            }
            case 3: {
                return new aqaj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqaj.a, "\u0001\u0000", null);
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
