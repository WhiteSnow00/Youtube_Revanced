import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrw extends agzi implements ahax
{
    public static final alrw a;
    private static volatile ahbe g;
    public int b;
    public Object c;
    public int d;
    public boolean e;
    public int f;
    private int h;
    private aioe i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(alrw.class, a = new alrw());
    }
    
    private alrw() {
        this.b = 0;
        this.j = 2;
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
                final ahbe g;
                if ((g = alrw.g) == null) {
                    synchronized (alrw.class) {
                        if (alrw.g == null) {
                            alrw.g = (ahbe)new agzb((agzi)alrw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alrw.a;
            }
            case 4: {
                return new agza((agzi)alrw.a);
            }
            case 3: {
                return new alrw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrw.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u100b\u0002\u0004\u1409\u0003\u0005\u143c\u0000\u0006\u143c\u0000", new Object[] { "c", "b", "h", "d", alsb.b, "e", "f", "i", ajsq.class, anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
