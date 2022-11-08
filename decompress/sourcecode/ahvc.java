import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvc extends agzi implements ahax
{
    public static final ahvc a;
    private static volatile ahbe b;
    private int c;
    private ahvb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahvc.class, a = new ahvc());
    }
    
    private ahvc() {
        this.e = 2;
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
                final ahbe b2;
                if ((b2 = ahvc.b) == null) {
                    synchronized (ahvc.class) {
                        if (ahvc.b == null) {
                            ahvc.b = (ahbe)new agzb((agzi)ahvc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahvc.a;
            }
            case 4: {
                return new agza((agzi)ahvc.a);
            }
            case 3: {
                return new ahvc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvc.a, "\u0001\u0001\u0000\u0001\uf972\u2b66\uf972\u2b66\u0001\u0000\u0000\u0001\uf972\u2b66\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
