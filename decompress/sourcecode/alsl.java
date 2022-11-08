import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsl extends agzi implements ahax
{
    public static final alsl a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alsl.class, a = new alsl());
    }
    
    private alsl() {
        this.e = 2;
        final agyc b = agyc.b;
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
                if ((b2 = alsl.b) == null) {
                    synchronized (alsl.class) {
                        if (alsl.b == null) {
                            alsl.b = (ahbe)new agzb((agzi)alsl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alsl.a;
            }
            case 4: {
                return new agza((agzi)alsl.a);
            }
            case 3: {
                return new alsl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsl.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004\u1409\u0003", new Object[] { "c", "d" });
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
