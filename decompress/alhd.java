import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhd extends ahcz implements aheo
{
    public static final alhd a;
    private static volatile ahev g;
    public int b;
    public aknh c;
    public String d;
    public aqac e;
    public String f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alhd.class, a = new alhd());
    }
    
    private alhd() {
        this.h = 2;
        this.d = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = alhd.g) == null) {
                    synchronized (alhd.class) {
                        if (alhd.g == null) {
                            alhd.g = (ahev)new ahcs((ahcz)alhd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alhd.a;
            }
            case 4: {
                return new ahcr((ahcz)alhd.a);
            }
            case 3: {
                return new alhd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhd.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
