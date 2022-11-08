import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anix extends agzi implements ahax
{
    public static final anix a;
    private static volatile ahbe o;
    public int b;
    public ajsq c;
    public boolean d;
    public aioe e;
    public double f;
    public ajsq g;
    public aioe h;
    public aioe i;
    public aioe j;
    public double k;
    public ajsq l;
    public double m;
    public ajsq n;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(anix.class, a = new anix());
    }
    
    private anix() {
        this.p = 2;
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
                final ahbe o3;
                if ((o3 = anix.o) == null) {
                    synchronized (anix.class) {
                        if (anix.o == null) {
                            anix.o = (ahbe)new agzb((agzi)anix.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return anix.a;
            }
            case 4: {
                return new agza((agzi)anix.a);
            }
            case 3: {
                return new anix();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anix.a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\b\u0001\u1409\u0000\u0003\u1007\u0003\u0004\u1409\u0004\u0005\u1000\u0005\u0006\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1000\n\f\u1409\u000b\r\u1000\f\u000e\u1409\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
