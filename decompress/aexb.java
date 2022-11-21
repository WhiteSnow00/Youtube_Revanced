import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexb extends ahcz implements aheo
{
    public static final aexb a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aexb.class, a = new aexb());
    }
    
    private aexb() {
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
                if ((b = aexb.b) == null) {
                    synchronized (aexb.class) {
                        if (aexb.b == null) {
                            aexb.b = (ahev)new ahcs((ahcz)aexb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aexb.a;
            }
            case 4: {
                return new ahcr((ahcz)aexb.a);
            }
            case 3: {
                return new aexb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexb.a, "\u0001\u0000", null);
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
