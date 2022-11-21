import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohj extends ahcz implements aheo
{
    public static final aohj a;
    public static final ahcx b;
    private static volatile ahev d;
    public String c;
    private int e;
    
    static {
        final aohj a2 = new aohj();
        ahcz.registerDefaultInstance(aohj.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 453651355, ahgc.k, aohj.class);
    }
    
    private aohj() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aohj.d) == null) {
                    synchronized (aohj.class) {
                        if (aohj.d == null) {
                            aohj.d = (ahev)new ahcs((ahcz)aohj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aohj.a;
            }
            case 4: {
                return new ahcr((ahcz)aohj.a);
            }
            case 3: {
                return new aohj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
