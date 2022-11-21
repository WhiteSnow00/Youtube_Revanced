import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqii extends ahcz implements aheo
{
    public static final aqii a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aqii.class, a = new aqii());
    }
    
    private aqii() {
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
                if ((d = aqii.d) == null) {
                    synchronized (aqii.class) {
                        if (aqii.d == null) {
                            aqii.d = (ahev)new ahcs((ahcz)aqii.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqii.a;
            }
            case 4: {
                return new ahcr((ahcz)aqii.a);
            }
            case 3: {
                return new aqii();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqii.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aqdx.n });
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
