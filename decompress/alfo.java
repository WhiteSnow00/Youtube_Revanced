import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfo extends ahcz implements aheo
{
    public static final alfo a;
    private static volatile ahev g;
    public int b;
    public aknh c;
    public long d;
    public String e;
    public String f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alfo.class, a = new alfo());
    }
    
    private alfo() {
        this.h = 2;
        this.e = "";
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
                if ((g = alfo.g) == null) {
                    synchronized (alfo.class) {
                        if (alfo.g == null) {
                            alfo.g = (ahev)new ahcs((ahcz)alfo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alfo.a;
            }
            case 4: {
                return new ahcr((ahcz)alfo.a);
            }
            case 3: {
                return new alfo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfo.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
