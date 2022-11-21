import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieq extends ahcz implements aheo
{
    public static final aieq a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public int d;
    
    static {
        final aieq a2 = new aieq();
        ahcz.registerDefaultInstance(aieq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aies.a, a2, (MessageLite)a2, null, 160206468, ahgc.k, aieq.class);
    }
    
    private aieq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aieq.e) == null) {
                    synchronized (aieq.class) {
                        if (aieq.e == null) {
                            aieq.e = (ahev)new ahcs((ahcz)aieq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aieq.a;
            }
            case 4: {
                return new ahcr((ahcz)aieq.a);
            }
            case 3: {
                return new aieq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aieq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aidb.s });
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
