import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexu extends ahcz implements aheo
{
    public static final aexu a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aexu.class, a = new aexu());
    }
    
    private aexu() {
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
                if ((b = aexu.b) == null) {
                    synchronized (aexu.class) {
                        if (aexu.b == null) {
                            aexu.b = (ahev)new ahcs((ahcz)aexu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aexu.a;
            }
            case 4: {
                return new ahcr((ahcz)aexu.a);
            }
            case 3: {
                return new aexu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexu.a, "\u0000\u0000", null);
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
