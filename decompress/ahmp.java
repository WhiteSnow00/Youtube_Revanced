import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmp extends ahcz implements aheo
{
    public static final ahmp a;
    private static volatile ahev g;
    public int b;
    public aowb c;
    public ajws d;
    public aisc e;
    public ahbt f;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(ahmp.class, a = new ahmp());
    }
    
    private ahmp() {
        this.i = 2;
        this.f = ahbt.b;
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
                final ahev g;
                if ((g = ahmp.g) == null) {
                    synchronized (ahmp.class) {
                        if (ahmp.g == null) {
                            ahmp.g = (ahev)new ahcs((ahcz)ahmp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahmp.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmp.a);
            }
            case 3: {
                return new ahmp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmp.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
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
