import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmj extends ahcz implements aheo
{
    public static final ahmj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ahmj.class, a = new ahmj());
    }
    
    private ahmj() {
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
                if ((b = ahmj.b) == null) {
                    synchronized (ahmj.class) {
                        if (ahmj.b == null) {
                            ahmj.b = (ahev)new ahcs((ahcz)ahmj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahmj.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmj.a);
            }
            case 3: {
                return new ahmj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmj.a, "\u0001\u0000", null);
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
