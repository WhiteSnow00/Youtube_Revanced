import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anut extends ahcz implements aheo
{
    public static final anut a;
    public static final ahcx b;
    private static volatile ahev e;
    public ahni c;
    public int d;
    private int f;
    
    static {
        final anut a2 = new anut();
        ahcz.registerDefaultInstance(anut.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)anuv.a, a2, (MessageLite)a2, null, 400250658, ahgc.k, anut.class);
    }
    
    private anut() {
        this.d = 1;
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
                if ((e = anut.e) == null) {
                    synchronized (anut.class) {
                        if (anut.e == null) {
                            anut.e = (ahev)new ahcs((ahcz)anut.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anut.a;
            }
            case 4: {
                return new ahcr((ahcz)anut.a);
            }
            case 3: {
                return new anut();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anut.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001", new Object[] { "f", "c", "d" });
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
