import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsl extends ahcz implements aheo
{
    public static final apsl a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsl.class, a = new apsl());
    }
    
    private apsl() {
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
                if ((b = apsl.b) == null) {
                    synchronized (apsl.class) {
                        if (apsl.b == null) {
                            apsl.b = (ahev)new ahcs((ahcz)apsl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsl.a;
            }
            case 4: {
                return new ahcr((ahcz)apsl.a);
            }
            case 3: {
                return new apsl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsl.a, "\u0001\u0000", null);
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
