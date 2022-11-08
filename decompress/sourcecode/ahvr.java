import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvr extends agzi implements ahax
{
    public static final ahvr a;
    private static volatile ahbe m;
    public int b;
    public akbf c;
    public akbf d;
    public boolean e;
    public aioe f;
    public aioe g;
    public aioe h;
    public aioe i;
    public ahgn j;
    public ahgn k;
    public agyc l;
    private aioe n;
    private ajsq o;
    private ajsq p;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(ahvr.class, a = new ahvr());
    }
    
    private ahvr() {
        this.r = 2;
        this.l = agyc.b;
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
                final ahbe m;
                if ((m = ahvr.m) == null) {
                    synchronized (ahvr.class) {
                        if (ahvr.m == null) {
                            ahvr.m = (ahbe)new agzb((agzi)ahvr.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ahvr.a;
            }
            case 4: {
                return new agza((agzi)ahvr.a);
            }
            case 3: {
                return new ahvr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvr.a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1009\u0007\b\u1009\b\t\u1409\r\n\u100a\u000e\f\u1409\u000b\r\u1409\f\u000e\u1409\n\u000f\u1007\u0002", new Object[] { "b", "c", "d", "f", "g", "h", "i", "j", "k", "q", "l", "o", "p", "n", "e" });
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
