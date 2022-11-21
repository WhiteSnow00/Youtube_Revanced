import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbt extends ahcz implements aheo
{
    private static final arbt a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arbt.class, a = new arbt());
    }
    
    private arbt() {
    }
    
    public static arbt a() {
        return arbt.a;
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
                if ((b = arbt.b) == null) {
                    synchronized (arbt.class) {
                        if (arbt.b == null) {
                            arbt.b = (ahev)new ahcs((ahcz)arbt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arbt.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arbt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbt.a, "\u0001\u0000", null);
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
