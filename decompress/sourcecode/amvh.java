import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvh extends agzi implements ahax
{
    public static final amvh a;
    private static volatile ahbe y;
    public int b;
    public agyc c;
    public agyc d;
    public long e;
    public String f;
    public amvf g;
    public amvg h;
    public agzq i;
    public agzq j;
    public agyc k;
    public boolean l;
    public boolean m;
    public ajpm n;
    public long o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public String w;
    public String x;
    private byte z;
    
    static {
        agzi.registerDefaultInstance(amvh.class, a = new amvh());
    }
    
    private amvh() {
        this.z = 2;
        this.c = agyc.b;
        this.d = agyc.b;
        this.f = "";
        this.i = agzi.emptyIntList();
        this.j = agzi.emptyIntList();
        this.k = agyc.b;
        this.p = "";
        this.w = "";
        this.x = "";
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
                final ahbe y;
                if ((y = amvh.y) == null) {
                    synchronized (amvh.class) {
                        if (amvh.y == null) {
                            amvh.y = (ahbe)new agzb((agzi)amvh.a);
                        }
                    }
                }
                return y;
            }
            case 5: {
                return amvh.a;
            }
            case 4: {
                return new agza((agzi)amvh.a);
            }
            case 3: {
                return new amvh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvh.a, "\u0001\u0016\u0000\u0001\u0001#\u0016\u0000\u0002\u0001\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u1002\u0002\u0005\u1008\u0004\u0007\u1009\u0007\n\u0016\u000b\u0016\f\u1409\u0006\u0010\u100a\f\u0011\u1007\r\u0016\u1007\u0012\u0017\u1009\u0013\u0018\u1002\u0014\u0019\u1008\u0015\u001a\u1007\u0016\u001b\u1007\u0018\u001d\u1007\u001a\u001e\u1007\u001b\u001f\u1007\u001c \u1008\u001d!\u1008\u001e#\u1007\u0017", new Object[] { "b", "c", "d", "e", "f", "h", "i", "j", "g", "k", "l", "m", "n", "o", "p", "q", "s", "t", "u", "v", "w", "x", "r" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.z = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
