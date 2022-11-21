import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqot extends ahcz implements aheo
{
    private static final aqot a;
    private static volatile ahev b;
    private int c;
    private aqoy d;
    
    static {
        ahcz.registerDefaultInstance(aqot.class, a = new aqot());
    }
    
    private aqot() {
    }
    
    public static aqos a() {
        return (aqos)aqot.a.createBuilder();
    }
    
    static aqot b() {
        return aqot.a;
    }
    
    public static void c(final aqot aqot, final aqoy aqoy) {
        aqot.d(aqoy);
    }
    
    private void d(final aqoy d) {
        this.d = d;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqot.b) == null) {
                    synchronized (aqot.class) {
                        if (aqot.b == null) {
                            aqot.b = (ahev)new ahcs((ahcz)aqot.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqot.a;
            }
            case 4: {
                return new aqos();
            }
            case 3: {
                return new aqot();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqot.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
