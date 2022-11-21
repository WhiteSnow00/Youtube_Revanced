import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almv extends ahcz implements aheo
{
    public static final almv a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(almv.class, a = new almv());
    }
    
    private almv() {
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
                if ((b = almv.b) == null) {
                    synchronized (almv.class) {
                        if (almv.b == null) {
                            almv.b = (ahev)new ahcs((ahcz)almv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almv.a;
            }
            case 4: {
                return new ahcr((ahcz)almv.a);
            }
            case 3: {
                return new almv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almv.a, "\u0001\u0000", null);
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
