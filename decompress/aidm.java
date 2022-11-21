import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidm extends ahcz implements aheo
{
    public static final aidm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aidm.class, a = new aidm());
    }
    
    private aidm() {
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
                if ((b = aidm.b) == null) {
                    synchronized (aidm.class) {
                        if (aidm.b == null) {
                            aidm.b = (ahev)new ahcs((ahcz)aidm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidm.a;
            }
            case 4: {
                return new ahcr((ahcz)aidm.a);
            }
            case 3: {
                return new aidm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidm.a, "\u0001\u0000", null);
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
