import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpz extends ahcz implements aheo
{
    public static final alpz a;
    public static final ahcx b;
    public static final ahcx c;
    private static volatile ahev d;
    
    static {
        ahcz.registerDefaultInstance(alpz.class, a = new alpz());
        b = ahcz.newSingularGeneratedExtension((MessageLite)alqa.a, false, null, null, 116410864, ahgc.h, Boolean.class);
        c = ahcz.newSingularGeneratedExtension((MessageLite)alqa.a, alqg.a, null, alqg.d, 116390062, ahgc.n, alqg.class);
    }
    
    private alpz() {
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
                if ((d = alpz.d) == null) {
                    synchronized (alpz.class) {
                        if (alpz.d == null) {
                            alpz.d = (ahev)new ahcs((ahcz)alpz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpz.a;
            }
            case 4: {
                return new ahcr((ahcz)alpz.a);
            }
            case 3: {
                return new alpz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpz.a, "\u0001\u0000", null);
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
