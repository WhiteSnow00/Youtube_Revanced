import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahij extends agzi implements ahax
{
    public static final ahij a;
    private static volatile ahbe j;
    public int b;
    public ahik c;
    public ahil d;
    public ahim e;
    public ahin f;
    public ahii g;
    public ahio h;
    public ajae i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahij.class, a = new ahij());
    }
    
    private ahij() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = ahij.j) == null) {
                    synchronized (ahij.class) {
                        if (ahij.j == null) {
                            ahij.j = (ahbe)new agzb((agzi)ahij.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahij.a;
            }
            case 4: {
                return new agza((agzi)ahij.a);
            }
            case 3: {
                return new ahij();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahij.a, "\u0001\u0007\u0000\u0001\ueec5\u24cf\ue7d0\u4960\u0007\u0000\u0000\u0001\ueec5\u24cf\u1009\u0002\uef11\u24cf\u1009\u0003\ufb8e\u24d0\u1009\u0000\uf120\u2923\u1409\u0007\uff12\u455b\u1009\n\ue3b9\u4717\u1009\u0004\ue7d0\u4960\u1009\u000b", new Object[] { "b", "d", "e", "c", "g", "h", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
