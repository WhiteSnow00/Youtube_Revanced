import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambb extends ahcz implements aheo
{
    public static final ambb a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public int e;
    
    static {
        final ambb a2 = new ambb();
        ahcz.registerDefaultInstance(ambb.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 147, ahgc.k, ambb.class);
    }
    
    private ambb() {
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
                if ((f = ambb.f) == null) {
                    synchronized (ambb.class) {
                        if (ambb.f == null) {
                            ambb.f = (ahev)new ahcs((ahcz)ambb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ambb.a;
            }
            case 4: {
                return new ahcr((ahcz)ambb.a);
            }
            case 3: {
                return new ambb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ambb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", amax.a() });
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
