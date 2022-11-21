import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahom extends ahcz implements aheo
{
    public static final ahom a;
    private static volatile ahev d;
    public ahdp b;
    public ahol c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(ahom.class, a = new ahom());
    }
    
    private ahom() {
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
                final ahev d;
                if ((d = ahom.d) == null) {
                    synchronized (ahom.class) {
                        if (ahom.d == null) {
                            ahom.d = (ahev)new ahcs((ahcz)ahom.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahom.a;
            }
            case 4: {
                return new ahcr((ahcz)ahom.a);
            }
            case 3: {
                return new ahom();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahom.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "e", "b", alyh.class, "c" });
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
