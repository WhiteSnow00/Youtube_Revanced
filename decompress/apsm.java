import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsm extends ahcz implements aheo
{
    public static final apsm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsm.class, a = new apsm());
    }
    
    private apsm() {
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
                if ((b = apsm.b) == null) {
                    synchronized (apsm.class) {
                        if (apsm.b == null) {
                            apsm.b = (ahev)new ahcs((ahcz)apsm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsm.a;
            }
            case 4: {
                return new ahcr((ahcz)apsm.a);
            }
            case 3: {
                return new apsm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsm.a, "\u0001\u0000", null);
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
