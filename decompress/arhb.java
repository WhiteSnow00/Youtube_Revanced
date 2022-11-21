import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhb extends ahcz implements aheo
{
    public static final arhb a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arhb.class, a = new arhb());
    }
    
    private arhb() {
        emptyProtobufList();
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
                if ((b = arhb.b) == null) {
                    synchronized (arhb.class) {
                        if (arhb.b == null) {
                            arhb.b = (ahev)new ahcs((ahcz)arhb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arhb.a;
            }
            case 4: {
                return new ahcr((ahcz)arhb.a);
            }
            case 3: {
                return new arhb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arhb.a, "\u0001\u0000", null);
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
