import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrn extends ahcz implements aheo
{
    public static final aqrn a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqrn.class, a = new aqrn());
    }
    
    private aqrn() {
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
                if ((b = aqrn.b) == null) {
                    synchronized (aqrn.class) {
                        if (aqrn.b == null) {
                            aqrn.b = (ahev)new ahcs((ahcz)aqrn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrn.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrn.a);
            }
            case 3: {
                return new aqrn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrn.a, "\u0001\u0000", null);
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
