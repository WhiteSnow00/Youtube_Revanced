import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anux extends ahcz implements aheo
{
    public static final anux a;
    private static volatile ahev d;
    public int b;
    public aisc c;
    private ajws e;
    private ajws f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(anux.class, a = new anux());
    }
    
    private anux() {
        this.h = 2;
        final ahbt b = ahbt.b;
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
                final ahev d;
                if ((d = anux.d) == null) {
                    synchronized (anux.class) {
                        if (anux.d == null) {
                            anux.d = (ahev)new ahcs((ahcz)anux.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anux.a;
            }
            case 4: {
                return new ahcr((ahcz)anux.a);
            }
            case 3: {
                return new anux();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anux.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0007\u1409\u0007", new Object[] { "b", "e", "f", "c", "g" });
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
