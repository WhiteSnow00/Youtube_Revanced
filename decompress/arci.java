import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arci extends ahcz implements aheo
{
    private static final arci a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arci.class, a = new arci());
    }
    
    private arci() {
    }
    
    public static arci a() {
        return arci.a;
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
                if ((b = arci.b) == null) {
                    synchronized (arci.class) {
                        if (arci.b == null) {
                            arci.b = (ahev)new ahcs((ahcz)arci.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arci.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arci();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arci.a, "\u0001\u0000", null);
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
