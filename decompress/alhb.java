import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhb extends ahcz implements aheo
{
    public static final alhb a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alhb.class, a = new alhb());
    }
    
    private alhb() {
        ahcz.emptyProtobufList();
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
                if ((b = alhb.b) == null) {
                    synchronized (alhb.class) {
                        if (alhb.b == null) {
                            alhb.b = (ahev)new ahcs((ahcz)alhb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alhb.a;
            }
            case 4: {
                return new ahcr((ahcz)alhb.a);
            }
            case 3: {
                return new alhb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhb.a, "\u0001\u0000", null);
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
