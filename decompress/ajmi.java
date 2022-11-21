import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmi extends ahcz implements aheo
{
    public static final ajmi a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(ajmi.class, a = new ajmi());
    }
    
    private ajmi() {
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
                if ((f = ajmi.f) == null) {
                    synchronized (ajmi.class) {
                        if (ajmi.f == null) {
                            ajmi.f = (ahev)new ahcs((ahcz)ajmi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajmi.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmi.a);
            }
            case 3: {
                return new ajmi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
