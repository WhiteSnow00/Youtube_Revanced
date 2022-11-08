import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajof extends agzi implements ahax
{
    public static final ajof a;
    private static volatile ahbe b;
    private int c;
    private aivu d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajof.class, (agzi)(a = new ajof()));
    }
    
    private ajof() {
        this.e = 2;
    }
    
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
                if ((b2 = ajof.b) == null) {
                    synchronized (ajof.class) {
                        if (ajof.b == null) {
                            ajof.b = (ahbe)new agzb((agzi)ajof.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajof.a;
            }
            case 4: {
                return new agza((agzi)ajof.a);
            }
            case 3: {
                return new ajof();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajof.a, "\u0001\u0001\u0000\u0001\uf0a6\u2cb2\uf0a6\u2cb2\u0001\u0000\u0000\u0001\uf0a6\u2cb2\u1409\u0000", new Object[] { "c", "d" });
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
