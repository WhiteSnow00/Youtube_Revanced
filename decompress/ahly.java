import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahly extends ahcz implements aheo
{
    public static final ahly a;
    private static volatile ahev j;
    public int b;
    public ahlz c;
    public ahma d;
    public ahmb e;
    public ahmc f;
    public ahlx g;
    public ahmd h;
    public ajeg i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(ahly.class, a = new ahly());
    }
    
    private ahly() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = ahly.j) == null) {
                    synchronized (ahly.class) {
                        if (ahly.j == null) {
                            ahly.j = (ahev)new ahcs((ahcz)ahly.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahly.a;
            }
            case 4: {
                return new ahcr((ahcz)ahly.a);
            }
            case 3: {
                return new ahly();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahly.a, "\u0001\u0007\u0000\u0001\ueec5\u24cf\ue7d0\u4960\u0007\u0000\u0000\u0001\ueec5\u24cf\u1009\u0002\uef11\u24cf\u1009\u0003\ufb8e\u24d0\u1009\u0000\uf120\u2923\u1409\u0007\uff12\u455b\u1009\n\ue3b9\u4717\u1009\u0004\ue7d0\u4960\u1009\u000b", new Object[] { "b", "d", "e", "c", "g", "h", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
