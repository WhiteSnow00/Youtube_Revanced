import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjo extends ahcz implements aheo
{
    public static final aqjo a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        final aqjo a2 = new aqjo();
        ahcz.registerDefaultInstance(aqjo.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqjd.a, a2, (MessageLite)a2, null, 280276962, ahgc.k, aqjo.class);
    }
    
    private aqjo() {
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
                if ((c = aqjo.c) == null) {
                    synchronized (aqjo.class) {
                        if (aqjo.c == null) {
                            aqjo.c = (ahev)new ahcs((ahcz)aqjo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqjo.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjo.a);
            }
            case 3: {
                return new aqjo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjo.a, "\u0001\u0000", null);
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
