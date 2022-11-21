import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgc extends ahcz implements aheo
{
    public static final akgc a;
    private static volatile ahev f;
    public int b;
    public anxb c;
    public anxb d;
    public anxb e;
    private aisc g;
    private ajws h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akgc.class, a = new akgc());
    }
    
    private akgc() {
        this.i = 2;
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
                if ((f = akgc.f) == null) {
                    synchronized (akgc.class) {
                        if (akgc.f == null) {
                            akgc.f = (ahev)new ahcs((ahcz)akgc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akgc.a;
            }
            case 4: {
                return new ahcr((ahcz)akgc.a);
            }
            case 3: {
                return new akgc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akgc.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "d", "g", "c", "e", "h" });
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
