import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agub extends ahcz implements aheo
{
    public static final agub a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public agtx d;
    
    static {
        final agub a2 = new agub();
        ahcz.registerDefaultInstance(agub.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)afrx.a, a2, (MessageLite)a2, null, 549, ahgc.k, agub.class);
    }
    
    private agub() {
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
                if ((e = agub.e) == null) {
                    synchronized (agub.class) {
                        if (agub.e == null) {
                            agub.e = (ahev)new ahcs((ahcz)agub.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agub.a;
            }
            case 4: {
                return new ahcr((ahcz)agub.a);
            }
            case 3: {
                return new agub();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agub.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
