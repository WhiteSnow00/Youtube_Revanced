import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyo extends ahcz implements aheo
{
    public static final apyo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apyo.class, a = new apyo());
    }
    
    private apyo() {
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
                if ((b = apyo.b) == null) {
                    synchronized (apyo.class) {
                        if (apyo.b == null) {
                            apyo.b = (ahev)new ahcs((ahcz)apyo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyo.a;
            }
            case 4: {
                return new ahcr((ahcz)apyo.a);
            }
            case 3: {
                return new apyo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyo.a, "\u0001\u0000", null);
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
