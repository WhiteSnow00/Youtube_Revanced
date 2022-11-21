import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqau extends ahcz implements aheo
{
    public static final aqau a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public boolean e;
    public int f;
    
    static {
        final aqau a2 = new aqau();
        ahcz.registerDefaultInstance(aqau.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 291, ahgc.k, aqau.class);
    }
    
    private aqau() {
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
                final ahev g;
                if ((g = aqau.g) == null) {
                    synchronized (aqau.class) {
                        if (aqau.g == null) {
                            aqau.g = (ahev)new ahcs((ahcz)aqau.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqau.a;
            }
            case 4: {
                return new ahcr((ahcz)aqau.a);
            }
            case 3: {
                return new aqau();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqau.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002", new Object[] { "c", "d", "e", "f", apqo.a() });
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
