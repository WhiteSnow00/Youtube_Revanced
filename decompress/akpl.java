import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpl extends ahcz implements aheo
{
    public static final akpl a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public aknh e;
    public String f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akpl.class, a = new akpl());
    }
    
    private akpl() {
        this.c = 0;
        this.h = 2;
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
                if ((g = akpl.g) == null) {
                    synchronized (akpl.class) {
                        if (akpl.g == null) {
                            akpl.g = (ahev)new ahcs((ahcz)akpl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akpl.a;
            }
            case 4: {
                return new ahcr((ahcz)akpl.a);
            }
            case 3: {
                return new akpl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpl.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u1008\u0005\u0005\u103c\u0000", new Object[] { "d", "c", "b", "e", akpo.class, akpn.class, "f", akpp.class });
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
