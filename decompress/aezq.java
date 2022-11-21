import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezq extends ahcz implements aheo
{
    public static final aezq a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aezq.class, a = new aezq());
    }
    
    private aezq() {
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
                if ((c = aezq.c) == null) {
                    synchronized (aezq.class) {
                        if (aezq.c == null) {
                            aezq.c = (ahev)new ahcs((ahcz)aezq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aezq.a;
            }
            case 4: {
                return new ahcr((ahcz)aezq.a);
            }
            case 3: {
                return new aezq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aezq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aezp.class });
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
