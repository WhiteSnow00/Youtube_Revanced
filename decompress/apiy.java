import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiy extends ahcz implements aheo
{
    public static final apiy a;
    public static final ahcx b;
    private static volatile ahev d;
    public anxb c;
    private int e;
    private byte f;
    
    static {
        final apiy a2 = new apiy();
        ahcz.registerDefaultInstance(apiy.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 163531772, ahgc.k, apiy.class);
    }
    
    private apiy() {
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
                if ((d = apiy.d) == null) {
                    synchronized (apiy.class) {
                        if (apiy.d == null) {
                            apiy.d = (ahev)new ahcs((ahcz)apiy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apiy.a;
            }
            case 4: {
                return new ahcr((ahcz)apiy.a);
            }
            case 3: {
                return new apiy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apiy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
