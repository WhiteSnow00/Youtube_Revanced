import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuy extends ahcz implements aheo
{
    public static final anuy a;
    private static volatile ahev f;
    public int b;
    public aowb c;
    public ajws d;
    public String e;
    private ajws g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(anuy.class, a = new anuy());
    }
    
    private anuy() {
        this.i = 2;
        this.e = "";
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = anuy.f) == null) {
                    synchronized (anuy.class) {
                        if (anuy.f == null) {
                            anuy.f = (ahev)new ahcs((ahcz)anuy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anuy.a;
            }
            case 4: {
                return new ahcr((ahcz)anuy.a);
            }
            case 3: {
                return new anuy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuy.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0007\u1409\u0006", new Object[] { "b", "c", "d", "g", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
