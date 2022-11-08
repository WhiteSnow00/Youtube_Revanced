import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrx extends agzi implements ahax
{
    public static final alrx a;
    private static volatile ahbe d;
    public int b;
    public anss c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alrx.class, a = new alrx());
    }
    
    private alrx() {
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
                final ahbe d;
                if ((d = alrx.d) == null) {
                    synchronized (alrx.class) {
                        if (alrx.d == null) {
                            alrx.d = (ahbe)new agzb((agzi)alrx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrx.a;
            }
            case 4: {
                return new agza((agzi)alrx.a);
            }
            case 3: {
                return new alrx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
