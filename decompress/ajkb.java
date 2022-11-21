import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkb extends ahcz implements aheo
{
    public static final ajkb a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public int d;
    
    static {
        final ajkb a2 = new ajkb();
        ahcz.registerDefaultInstance(ajkb.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aprw.a, a2, (MessageLite)a2, null, 337527695, ahgc.k, ajkb.class);
    }
    
    private ajkb() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ajkb.e) == null) {
                    synchronized (ajkb.class) {
                        if (ajkb.e == null) {
                            ajkb.e = (ahev)new ahcs((ahcz)ajkb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajkb.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkb.a);
            }
            case 3: {
                return new ajkb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aqbo.a() });
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
