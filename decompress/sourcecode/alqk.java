import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqk extends agzi implements ahax
{
    public static final alqk a;
    private static volatile ahbe i;
    public ajsq b;
    public ajsq c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(alqk.class, a = new alqk());
    }
    
    private alqk() {
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
                final ahbe i;
                if ((i = alqk.i) == null) {
                    synchronized (alqk.class) {
                        if (alqk.i == null) {
                            alqk.i = (ahbe)new agzb((agzi)alqk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alqk.a;
            }
            case 4: {
                return new agza((agzi)alqk.a);
            }
            case 3: {
                return new alqk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqk.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100b\u0002\u0003\u100b\u0003\u0004\u100b\u0004\u0005\u100b\u0005\u0006\u100b\u0006\u0007\u1409\u0001", new Object[] { "j", "b", "d", "e", "f", "g", "h", "c" });
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
