import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdy extends ahcz implements aheo
{
    public static final apdy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apdy.class, a = new apdy());
    }
    
    private apdy() {
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
                if ((b = apdy.b) == null) {
                    synchronized (apdy.class) {
                        if (apdy.b == null) {
                            apdy.b = (ahev)new ahcs((ahcz)apdy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdy.a;
            }
            case 4: {
                return new ahcr((ahcz)apdy.a);
            }
            case 3: {
                return new apdy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdy.a, "\u0001\u0000", null);
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
