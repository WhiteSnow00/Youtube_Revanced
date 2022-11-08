import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikf extends agzi implements ahax
{
    public static final agzr a;
    public static final aikf b;
    private static volatile ahbe n;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public agzq k;
    public int l;
    public agyc m;
    private ajsq o;
    private ahfw p;
    private byte q;
    
    static {
        a = (agzr)new prz(13);
        agzi.registerDefaultInstance(aikf.class, b = new aikf());
    }
    
    private aikf() {
        this.q = 2;
        this.k = agzi.emptyIntList();
        this.m = agyc.b;
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
                if ((n = aikf.n) == null) {
                    synchronized (aikf.class) {
                        if (aikf.n == null) {
                            aikf.n = (ahbe)new agzb((agzi)aikf.b);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return aikf.b;
            }
            case 4: {
                return new agza((agzi)aikf.b);
            }
            case 3: {
                return new aikf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikf.b, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1409\t\u0005\u100a\n\u0006\u1007\u0006\u0007\u1007\u0007\b\u1007\u0003\t\u1007\u0005\n\u1007\u0004\u000b,\f\u100c\b", new Object[] { "c", "o", "d", "e", "p", "m", "i", "j", "f", "h", "g", "k", amuv.a(), "l", amuv.a() });
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
