import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqd extends ahcz implements aheo
{
    public static final aiqd a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aiqd.class, a = new aiqd());
    }
    
    private aiqd() {
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
                if ((b = aiqd.b) == null) {
                    synchronized (aiqd.class) {
                        if (aiqd.b == null) {
                            aiqd.b = (ahev)new ahcs((ahcz)aiqd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiqd.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqd.a);
            }
            case 3: {
                return new aiqd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqd.a, "\u0001\u0000", null);
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
