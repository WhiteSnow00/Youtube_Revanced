import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvl extends ahcz implements aheo
{
    public static final apvl a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public ahej e;
    
    static {
        final apvl a2 = new apvl();
        ahcz.registerDefaultInstance(apvl.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 413, ahgc.k, apvl.class);
    }
    
    private apvl() {
        this.e = ahej.a;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apvl.f) == null) {
                    synchronized (apvl.class) {
                        if (apvl.f == null) {
                            apvl.f = (ahev)new ahcs((ahcz)apvl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apvl.a;
            }
            case 4: {
                return new ahcr((char[][][])null, (boolean[])null);
            }
            case 3: {
                return new apvl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1008\u0000\u00022", new Object[] { "c", "d", "e", apvk.a });
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
