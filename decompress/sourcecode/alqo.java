import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqo extends agzi implements ahax
{
    public static final alqo a;
    private static volatile ahbe o;
    public int b;
    public String c;
    public ajsq d;
    public akbf e;
    public int f;
    public int g;
    public int h;
    public aorm i;
    public int j;
    public int k;
    public aioe l;
    public String m;
    public agyc n;
    private aloe p;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(alqo.class, a = new alqo());
    }
    
    private alqo() {
        this.r = 2;
        this.c = "";
        this.m = "";
        this.n = agyc.b;
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
                if ((o3 = alqo.o) == null) {
                    synchronized (alqo.class) {
                        if (alqo.o == null) {
                            alqo.o = (ahbe)new agzb((agzi)alqo.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alqo.a;
            }
            case 4: {
                return new agza((agzi)alqo.a);
            }
            case 3: {
                return new alqo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqo.a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0006\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u1409\u0003\u0006\u100b\u0005\u0007\u100b\u0006\b\u100b\u0007\t\u1409\b\n\u100b\t\u000b\u1409\u000b\f\u1008\f\r\u100b\n\u000e\u1409\r\u000f\u100a\u000e\u0010\u1409\u0002", new Object[] { "b", "c", "d", "p", "f", "g", "h", "i", "j", "l", "m", "k", "q", "n", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
