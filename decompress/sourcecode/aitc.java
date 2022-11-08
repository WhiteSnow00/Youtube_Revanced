import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitc extends agzi implements ahax
{
    public static final aitc a;
    private static volatile ahbe n;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public ajsq g;
    public ajsq h;
    public aite i;
    public aitd j;
    public aisz k;
    public aita l;
    public agyc m;
    private ahyg o;
    private ajsq p;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(aitc.class, a = new aitc());
    }
    
    private aitc() {
        this.c = 0;
        this.e = 0;
        this.r = 2;
        emptyProtobufList();
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
                if ((n = aitc.n) == null) {
                    synchronized (aitc.class) {
                        if (aitc.n == null) {
                            aitc.n = (ahbe)new agzb((agzi)aitc.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return aitc.a;
            }
            case 4: {
                return new agza((agzi)aitc.a);
            }
            case 3: {
                return new aitc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitc.a, "\u0001\u0011\u0002\u0001\u0001\u0017\u0011\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0005\u0004\u143c\u0000\u0005\u143c\u0001\u0006\u143c\u0001\u0007\u1409\u0014\b\u100a\u0015\n\u1409\u0003\u000b\u1409\u0004\r\u1009\r\u000e\u143c\u0001\u0010\u143c\u0000\u0011\u1009\u000f\u0012\u1009\u0010\u0014\u143c\u0001\u0017\u143c\u0001", new Object[] { "d", "c", "f", "e", "b", "g", "h", "i", aioe.class, ajsq.class, ajsq.class, "q", "m", "o", "p", "j", aitb.class, aioe.class, "k", "l", akbf.class, anss.class });
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
