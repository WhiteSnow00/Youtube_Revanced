import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipw extends ahcz implements aheo
{
    public static final aipw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aipw.class, a = new aipw());
    }
    
    private aipw() {
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
                if ((b = aipw.b) == null) {
                    synchronized (aipw.class) {
                        if (aipw.b == null) {
                            aipw.b = (ahev)new ahcs((ahcz)aipw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aipw.a;
            }
            case 4: {
                return new ahcr((ahcz)aipw.a);
            }
            case 3: {
                return new aipw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipw.a, "\u0001\u0000", null);
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
