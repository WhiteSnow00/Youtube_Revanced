import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohf extends ahcz implements aheo
{
    public static final aohf a;
    public static final ahcx b;
    private static volatile ahev c;
    private int d;
    private anxb e;
    private byte f;
    
    static {
        final aohf a2 = new aohf();
        ahcz.registerDefaultInstance(aohf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 376981509, ahgc.k, aohf.class);
    }
    
    private aohf() {
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
                final ahev c;
                if ((c = aohf.c) == null) {
                    synchronized (aohf.class) {
                        if (aohf.c == null) {
                            aohf.c = (ahev)new ahcs((ahcz)aohf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohf.a;
            }
            case 4: {
                return new ahcr((ahcz)aohf.a);
            }
            case 3: {
                return new aohf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "e" });
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
