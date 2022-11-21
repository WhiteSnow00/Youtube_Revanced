import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqje extends ahcz implements aheo
{
    public static final aqje a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(aqje.class, a = new aqje());
    }
    
    private aqje() {
        this.c = 0;
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
                if ((g = aqje.g) == null) {
                    synchronized (aqje.class) {
                        if (aqje.g == null) {
                            aqje.g = (ahev)new ahcs((ahcz)aqje.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqje.a;
            }
            case 4: {
                return new ahcr((ahcz)aqje.a);
            }
            case 3: {
                return new aqje();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqje.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103d\u0000\u0003\u103c\u0000\u0004\u100b\u0003\u0005\u100b\u0004", new Object[] { "d", "c", "b", aqjb.class, "e", "f" });
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
