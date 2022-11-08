import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniz extends agzi implements ahax
{
    public static final aniz a;
    private static volatile ahbe n;
    public int b;
    public int c;
    public Object d;
    public anss e;
    public agzy f;
    public agyc g;
    public ajsq h;
    public ajsq i;
    public aniw j;
    public long k;
    public boolean l;
    public String m;
    private ajsq o;
    private ahfw p;
    private anss q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(aniz.class, a = new aniz());
    }
    
    private aniz() {
        this.c = 0;
        this.r = 2;
        this.f = agzi.emptyProtobufList();
        this.g = agyc.b;
        emptyProtobufList();
        this.m = "";
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
                if ((n = aniz.n) == null) {
                    synchronized (aniz.class) {
                        if (aniz.n == null) {
                            aniz.n = (ahbe)new agzb((agzi)aniz.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return aniz.a;
            }
            case 4: {
                return new agza((char[][])null);
            }
            case 3: {
                return new aniz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aniz.a, "\u0001\r\u0001\u0001\u0001\u0012\r\u0000\u0001\b\u0001\u1409\u0003\u0002\u041b\u0003\u1409\u0004\u0005\u100a\u0005\u0006\u1409\u0006\u0007\u1409\u0007\t\u1409\b\n\u1002\t\r\u103b\u0000\u000e\u1409\u0002\u000f\u1007\f\u0010\u1409\r\u0012\u1008\u000f", new Object[] { "d", "c", "b", "o", "f", anix.class, "p", "g", "h", "i", "j", "k", "e", "l", "q", "m" });
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
