import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpl extends agzi implements ahax
{
    public static final ahpl a;
    private static volatile ahbe b;
    private int c;
    private ahpq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahpl.class, a = new ahpl());
    }
    
    private ahpl() {
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
                if ((b2 = ahpl.b) == null) {
                    synchronized (ahpl.class) {
                        if (ahpl.b == null) {
                            ahpl.b = (ahbe)new agzb((agzi)ahpl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpl.a;
            }
            case 4: {
                return new agza((agzi)ahpl.a);
            }
            case 3: {
                return new ahpl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpl.a, "\u0001\u0001\u0000\u0001\ufe70\u2b8b\ufe70\u2b8b\u0001\u0000\u0000\u0001\ufe70\u2b8b\u1409\u0000", new Object[] { "c", "d" });
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
