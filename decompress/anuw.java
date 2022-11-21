import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuw extends ahcz implements aheo
{
    public static final anuw a;
    private static volatile ahev f;
    public anyt b;
    public anxb c;
    public anuv d;
    public String e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(anuw.class, a = new anuw());
    }
    
    private anuw() {
        this.h = 2;
        this.e = "";
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
                final ahev f;
                if ((f = anuw.f) == null) {
                    synchronized (anuw.class) {
                        if (anuw.f == null) {
                            anuw.f = (ahev)new ahcs((ahcz)anuw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anuw.a;
            }
            case 4: {
                return new ahcr((ahcz)anuw.a);
            }
            case 3: {
                return new anuw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
