import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiej extends ahcz implements aheo
{
    private static final aiej a;
    private static volatile ahev b;
    private ahdp c;
    
    static {
        ahcz.registerDefaultInstance(aiej.class, a = new aiej());
    }
    
    private aiej() {
        this.c = ahcz.emptyProtobufList();
    }
    
    public static aiej a() {
        return aiej.a;
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
                if ((b = aiej.b) == null) {
                    synchronized (aiej.class) {
                        if (aiej.b == null) {
                            aiej.b = (ahev)new ahcs((ahcz)aiej.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiej.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new aiej();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiej.a, "\u0001\u0000", null);
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
