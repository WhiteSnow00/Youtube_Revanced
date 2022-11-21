import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezs extends ahcz implements aheo
{
    public static final aezs a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aezs.class, a = new aezs());
    }
    
    private aezs() {
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aezs.c) == null) {
                    synchronized (aezs.class) {
                        if (aezs.c == null) {
                            aezs.c = (ahev)new ahcs((ahcz)aezs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aezs.a;
            }
            case 4: {
                return new ahcr((ahcz)aezs.a);
            }
            case 3: {
                return new aezs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aezs.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agqj.class });
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
