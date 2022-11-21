import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqri extends ahcz implements aheo
{
    public static final aqri a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqri.class, a = new aqri());
    }
    
    private aqri() {
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
                if ((b = aqri.b) == null) {
                    synchronized (aqri.class) {
                        if (aqri.b == null) {
                            aqri.b = (ahev)new ahcs((ahcz)aqri.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqri.a;
            }
            case 4: {
                return new ahcr((ahcz)aqri.a);
            }
            case 3: {
                return new aqri();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqri.a, "\u0001\u0000", null);
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
