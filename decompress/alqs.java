import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqs extends ahcz implements aheo
{
    public static final alqs a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqs.class, a = new alqs());
    }
    
    private alqs() {
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
                if ((b = alqs.b) == null) {
                    synchronized (alqs.class) {
                        if (alqs.b == null) {
                            alqs.b = (ahev)new ahcs((ahcz)alqs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqs.a;
            }
            case 4: {
                return new ahcr((ahcz)alqs.a);
            }
            case 3: {
                return new alqs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqs.a, "\u0001\u0000", null);
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
