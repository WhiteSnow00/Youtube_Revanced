import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrh extends ahcz implements aheo
{
    public static final akrh a;
    private static volatile ahev g;
    public int b;
    public aknh c;
    public alxj d;
    public String e;
    public int f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akrh.class, a = new akrh());
    }
    
    private akrh() {
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
                final ahev g;
                if ((g = akrh.g) == null) {
                    synchronized (akrh.class) {
                        if (akrh.g == null) {
                            akrh.g = (ahev)new ahcs((ahcz)akrh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akrh.a;
            }
            case 4: {
                return new ahcr((ahcz)akrh.a);
            }
            case 3: {
                return new akrh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrh.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1009\u0001\u0004\u1008\u0002\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", aidb.j });
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
