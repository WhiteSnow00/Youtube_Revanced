import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojy extends ahcz implements aheo
{
    public static final aojy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aojy.class, a = new aojy());
    }
    
    private aojy() {
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
                if ((b = aojy.b) == null) {
                    synchronized (aojy.class) {
                        if (aojy.b == null) {
                            aojy.b = (ahev)new ahcs((ahcz)aojy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojy.a;
            }
            case 4: {
                return new ahcr((ahcz)aojy.a);
            }
            case 3: {
                return new aojy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojy.a, "\u0001\u0000", null);
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
