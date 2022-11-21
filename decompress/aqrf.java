import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrf extends ahcz implements aheo
{
    public static final aqrf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqrf.class, a = new aqrf());
    }
    
    private aqrf() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqrf.b) == null) {
                    synchronized (aqrf.class) {
                        if (aqrf.b == null) {
                            aqrf.b = (ahev)new ahcs((ahcz)aqrf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrf.a);
            }
            case 3: {
                return new aqrf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrf.a, "\u0001\u0000", null);
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
