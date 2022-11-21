import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjg extends ahcz implements aheo
{
    public static final aqjg a;
    public static final ahcx b;
    private static volatile ahev d;
    public float c;
    private int e;
    
    static {
        final aqjg a2 = new aqjg();
        ahcz.registerDefaultInstance(aqjg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqvn.a, a2, (MessageLite)a2, null, 3, ahgc.k, aqjg.class);
    }
    
    private aqjg() {
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
                if ((d = aqjg.d) == null) {
                    synchronized (aqjg.class) {
                        if (aqjg.d == null) {
                            aqjg.d = (ahev)new ahcs((ahcz)aqjg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqjg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjg.a);
            }
            case 3: {
                return new aqjg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "e", "c" });
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
