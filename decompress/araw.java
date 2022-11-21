import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araw extends ahcz implements aheo
{
    private static final araw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(araw.class, a = new araw());
    }
    
    private araw() {
    }
    
    public static araw a() {
        return araw.a;
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
                if ((b = araw.b) == null) {
                    synchronized (araw.class) {
                        if (araw.b == null) {
                            araw.b = (ahev)new ahcs((ahcz)araw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return araw.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new araw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)araw.a, "\u0001\u0000", null);
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
