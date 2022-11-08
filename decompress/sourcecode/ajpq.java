import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpq extends agzi implements ahax
{
    public static final ajpq a;
    private static volatile ahbe n;
    public anss b;
    public aorm c;
    public ajsq d;
    public akbf e;
    public aioe f;
    public ajsq g;
    public ajsq h;
    public akbf i;
    public ajsq j;
    public ajsq k;
    public int l;
    public agyc m;
    private int o;
    private ajsq p;
    private aioe q;
    private ajsq r;
    private ahfw s;
    private byte t;
    
    static {
        agzi.registerDefaultInstance((Class)ajpq.class, (agzi)(a = new ajpq()));
    }
    
    private ajpq() {
        this.t = 2;
        this.m = agyc.b;
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
                final ahbe n;
                if ((n = ajpq.n) == null) {
                    synchronized (ajpq.class) {
                        if (ajpq.n == null) {
                            ajpq.n = (ahbe)new agzb((agzi)ajpq.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajpq.a;
            }
            case 4: {
                return new agza((agzi)ajpq.a);
            }
            case 3: {
                return new ajpq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpq.a, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u000e\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\n\f\u1409\u000b\r\u100a\u000e\u000e\u1409\u000f\u000f\u1409\u0003\u0010\u100c\r\u0011\u1409\t\u0012\u1409\f", new Object[] { "o", "b", "c", "d", "f", "g", "h", "p", "q", "j", "r", "m", "s", "e", "l", ajoa.p, "i", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.t = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
