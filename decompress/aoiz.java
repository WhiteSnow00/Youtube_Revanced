import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiz extends ahcz implements aheo
{
    public static final aoiz a;
    public static final ahcx b;
    private static volatile ahev d;
    public boolean c;
    private int e;
    
    static {
        final aoiz a2 = new aoiz();
        ahcz.registerDefaultInstance(aoiz.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 365619327, ahgc.k, aoiz.class);
    }
    
    private aoiz() {
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
                if ((d = aoiz.d) == null) {
                    synchronized (aoiz.class) {
                        if (aoiz.d == null) {
                            aoiz.d = (ahev)new ahcs((ahcz)aoiz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoiz.a;
            }
            case 4: {
                return new ahcr((ahcz)aoiz.a);
            }
            case 3: {
                return new aoiz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoiz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "e", "c" });
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
