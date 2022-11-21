import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohc extends ahcz implements aheo
{
    public static final aohc a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aohc.class, a = new aohc());
    }
    
    private aohc() {
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
                if ((b = aohc.b) == null) {
                    synchronized (aohc.class) {
                        if (aohc.b == null) {
                            aohc.b = (ahev)new ahcs((ahcz)aohc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohc.a;
            }
            case 4: {
                return new ahcr((ahcz)aohc.a);
            }
            case 3: {
                return new aohc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohc.a, "\u0001\u0000", null);
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
