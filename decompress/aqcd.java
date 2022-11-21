import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcd extends ahcz implements aheo
{
    public static final aqcd a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqcd.class, a = new aqcd());
    }
    
    private aqcd() {
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
                if ((b = aqcd.b) == null) {
                    synchronized (aqcd.class) {
                        if (aqcd.b == null) {
                            aqcd.b = (ahev)new ahcs((ahcz)aqcd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqcd.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcd.a);
            }
            case 3: {
                return new aqcd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcd.a, "\u0001\u0000", null);
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
