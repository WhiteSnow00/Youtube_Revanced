import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apeo extends ahcz implements aheo
{
    public static final apeo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apeo.class, a = new apeo());
    }
    
    private apeo() {
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
                if ((b = apeo.b) == null) {
                    synchronized (apeo.class) {
                        if (apeo.b == null) {
                            apeo.b = (ahev)new ahcs((ahcz)apeo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apeo.a;
            }
            case 4: {
                return new ahcr((ahcz)apeo.a);
            }
            case 3: {
                return new apeo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apeo.a, "\u0001\u0000", null);
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
