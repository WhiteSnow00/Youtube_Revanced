import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubm extends ahcz implements aheo
{
    public static final aubm a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public ahdh e;
    public ahdh f;
    
    static {
        ahcz.registerDefaultInstance(aubm.class, a = new aubm());
    }
    
    private aubm() {
        this.e = ahcz.emptyIntList();
        this.f = ahcz.emptyIntList();
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
                if ((g = aubm.g) == null) {
                    synchronized (aubm.class) {
                        if (aubm.g == null) {
                            aubm.g = (ahev)new ahcs((ahcz)aubm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aubm.a;
            }
            case 4: {
                return new ahcr((short[][])null, (boolean[][])null);
            }
            case 3: {
                return new aubm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubm.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003'\u0004'", new Object[] { "b", "c", "d", "e", "f" });
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
