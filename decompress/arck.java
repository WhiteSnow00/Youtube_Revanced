import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arck extends ahcz implements aheo
{
    private static final arck a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arck.class, a = new arck());
    }
    
    private arck() {
    }
    
    public static arck a() {
        return arck.a;
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
                if ((b = arck.b) == null) {
                    synchronized (arck.class) {
                        if (arck.b == null) {
                            arck.b = (ahev)new ahcs((ahcz)arck.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arck.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arck();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arck.a, "\u0001\u0000", null);
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
