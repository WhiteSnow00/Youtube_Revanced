import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojf extends ahcz implements aheo
{
    public static final aojf a;
    public static final ahcx b;
    private static volatile ahev d;
    public aojg c;
    private int e;
    private byte f;
    
    static {
        final aojf a2 = new aojf();
        ahcz.registerDefaultInstance(aojf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 137739979, ahgc.k, aojf.class);
    }
    
    private aojf() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aojf.d) == null) {
                    synchronized (aojf.class) {
                        if (aojf.d == null) {
                            aojf.d = (ahev)new ahcs((ahcz)aojf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aojf.a;
            }
            case 4: {
                return new ahcr((ahcz)aojf.a);
            }
            case 3: {
                return new aojf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
