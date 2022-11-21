import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjt extends ahcz implements aheo
{
    public static final aqjt a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public int d;
    public boolean e;
    private int g;
    
    static {
        final aqjt a2 = new aqjt();
        ahcz.registerDefaultInstance(aqjt.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqka.a, a2, (MessageLite)a2, null, 188911708, ahgc.k, aqjt.class);
    }
    
    private aqjt() {
        this.e = true;
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
                if ((f = aqjt.f) == null) {
                    synchronized (aqjt.class) {
                        if (aqjt.f == null) {
                            aqjt.f = (ahev)new ahcs((ahcz)aqjt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqjt.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjt.a);
            }
            case 3: {
                return new aqjt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u1004\u0001\u0003\u1007\u0002", new Object[] { "g", "c", "d", "e" });
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
