import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apif extends ahcz implements aheo
{
    public static final apif a;
    public static final ahcx b;
    private static volatile ahev e;
    public anxb c;
    public anxb d;
    private int f;
    private byte g;
    
    static {
        final apif a2 = new apif();
        ahcz.registerDefaultInstance(apif.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 328479972, ahgc.k, apif.class);
    }
    
    private apif() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apif.e) == null) {
                    synchronized (apif.class) {
                        if (apif.e == null) {
                            apif.e = (ahev)new ahcs((ahcz)apif.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apif.a;
            }
            case 4: {
                return new ahcr((ahcz)apif.a);
            }
            case 3: {
                return new apif();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apif.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "f", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
