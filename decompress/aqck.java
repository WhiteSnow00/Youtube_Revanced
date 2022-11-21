import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqck extends ahcz implements aheo
{
    public static final aqck a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqck.class, a = new aqck());
    }
    
    private aqck() {
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
                if ((b = aqck.b) == null) {
                    synchronized (aqck.class) {
                        if (aqck.b == null) {
                            aqck.b = (ahev)new ahcs((ahcz)aqck.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqck.a;
            }
            case 4: {
                return new ahcr((ahcz)aqck.a);
            }
            case 3: {
                return new aqck();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqck.a, "\u0001\u0000", null);
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
