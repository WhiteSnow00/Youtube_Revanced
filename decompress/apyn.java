import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyn extends ahcz implements aheo
{
    public static final apyn a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public boolean d;
    public alxw e;
    private byte g;
    
    static {
        final apyn a2 = new apyn();
        ahcz.registerDefaultInstance(apyn.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqjk.a, a2, (MessageLite)a2, null, 252911519, ahgc.k, apyn.class);
    }
    
    private apyn() {
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
                final ahev f;
                if ((f = apyn.f) == null) {
                    synchronized (apyn.class) {
                        if (apyn.f == null) {
                            apyn.f = (ahev)new ahcs((ahcz)apyn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apyn.a;
            }
            case 4: {
                return new ahcr((ahcz)apyn.a);
            }
            case 3: {
                return new apyn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyn.a, "\u0001\u0002\u0000\u0001\u0003\u03e7\u0002\u0000\u0000\u0001\u0003\u1007\u0000\u03e7\u1409\u0001", new Object[] { "c", "d", "e" });
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
