import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqic extends ahcz implements aheo
{
    public static final aqic a;
    public static final ahcx b;
    private static volatile ahev d;
    public ahej c;
    
    static {
        final aqic a2 = new aqic();
        ahcz.registerDefaultInstance(aqic.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 188495463, ahgc.k, aqic.class);
    }
    
    private aqic() {
        this.c = ahej.a;
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
                if ((d = aqic.d) == null) {
                    synchronized (aqic.class) {
                        if (aqic.d == null) {
                            aqic.d = (ahev)new ahcs((ahcz)aqic.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqic.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (boolean[][])null);
            }
            case 3: {
                return new aqic();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqic.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aqib.a });
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
