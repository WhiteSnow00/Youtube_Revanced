import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphh extends ahcz implements aheo
{
    public static final aphh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aphh.class, a = new aphh());
    }
    
    private aphh() {
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
                if ((b = aphh.b) == null) {
                    synchronized (aphh.class) {
                        if (aphh.b == null) {
                            aphh.b = (ahev)new ahcs((ahcz)aphh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphh.a;
            }
            case 4: {
                return new ahcr((ahcz)aphh.a);
            }
            case 3: {
                return new aphh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphh.a, "\u0001\u0000", null);
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
