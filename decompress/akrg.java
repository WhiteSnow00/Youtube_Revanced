import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrg extends ahcz implements aheo
{
    public static final akrg a;
    private static volatile ahev c;
    public aizd b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akrg.class, a = new akrg());
    }
    
    private akrg() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = akrg.c) == null) {
                    synchronized (akrg.class) {
                        if (akrg.c == null) {
                            akrg.c = (ahev)new ahcs((ahcz)akrg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akrg.a;
            }
            case 4: {
                return new ahcr((ahcz)akrg.a);
            }
            case 3: {
                return new akrg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrg.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
