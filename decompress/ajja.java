import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajja extends ahcz implements aheo
{
    public static final ajja a;
    public static final ahcx b;
    private static volatile ahev d;
    public float c;
    private int e;
    
    static {
        final ajja a2 = new ajja();
        ahcz.registerDefaultInstance(ajja.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqjd.a, a2, (MessageLite)a2, null, 339295757, ahgc.k, ajja.class);
    }
    
    private ajja() {
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
                if ((d = ajja.d) == null) {
                    synchronized (ajja.class) {
                        if (ajja.d == null) {
                            ajja.d = (ahev)new ahcs((ahcz)ajja.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajja.a;
            }
            case 4: {
                return new ahcr((ahcz)ajja.a);
            }
            case 3: {
                return new ajja();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajja.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "e", "c" });
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
