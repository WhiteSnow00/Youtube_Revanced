import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agts extends ahcz implements aheo
{
    public static final agts a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agts.class, a = new agts());
    }
    
    private agts() {
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
                if ((b = agts.b) == null) {
                    synchronized (agts.class) {
                        if (agts.b == null) {
                            agts.b = (ahev)new ahcs((ahcz)agts.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agts.a;
            }
            case 4: {
                return new ahcr((ahcz)agts.a);
            }
            case 3: {
                return new agts();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agts.a, "\u0001\u0000", null);
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
