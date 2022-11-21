import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoa extends ahcz implements aheo
{
    public static final apoa a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apoa.class, a = new apoa());
    }
    
    private apoa() {
        emptyIntList();
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
                if ((b = apoa.b) == null) {
                    synchronized (apoa.class) {
                        if (apoa.b == null) {
                            apoa.b = (ahev)new ahcs((ahcz)apoa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoa.a;
            }
            case 4: {
                return new ahcr((ahcz)apoa.a);
            }
            case 3: {
                return new apoa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoa.a, "\u0001\u0000", null);
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
