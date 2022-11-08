import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqn extends agzi implements ahax
{
    public static final alqn a;
    private static volatile ahbe n;
    public int b;
    public String c;
    public ajsq d;
    public int e;
    public int f;
    public int g;
    public aizn h;
    public aorm i;
    public int j;
    public int k;
    public aioe l;
    public String m;
    private aloe o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(alqn.class, a = new alqn());
    }
    
    private alqn() {
        this.q = 2;
        this.c = "";
        this.m = "";
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
                final ahbe n;
                if ((n = alqn.n) == null) {
                    synchronized (alqn.class) {
                        if (alqn.n == null) {
                            alqn.n = (ahbe)new agzb((agzi)alqn.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return alqn.a;
            }
            case 4: {
                return new agza((agzi)alqn.a);
            }
            case 3: {
                return new alqn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqn.a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0006\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0006\u100b\u0004\u0007\u100b\u0005\b\u100b\u0006\t\u1409\b\n\u100b\t\u000b\u1409\u000b\f\u1008\f\r\u100b\n\u000e\u1409\r\u0010\u1409\u0007", new Object[] { "b", "c", "d", "o", "e", "f", "g", "i", "j", "l", "m", "k", "p", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
