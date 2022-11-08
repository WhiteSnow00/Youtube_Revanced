import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankv extends agzi implements ahax
{
    public static final ankv a;
    private static volatile ahbe m;
    public int b;
    public aorm c;
    public agzy d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public agzy i;
    public aioe j;
    public anss k;
    public agyc l;
    private amer n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(ankv.class, a = new ankv());
    }
    
    private ankv() {
        this.p = 2;
        this.d = agzi.emptyProtobufList();
        this.i = agzi.emptyProtobufList();
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
                if ((m = ankv.m) == null) {
                    synchronized (ankv.class) {
                        if (ankv.m == null) {
                            ankv.m = (ahbe)new agzb((agzi)ankv.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ankv.a;
            }
            case 4: {
                return new agza((agzi)ankv.a);
            }
            case 3: {
                return new ankv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankv.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u000b\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u041b\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\b\t\u1409\t\n\u1409\u0001\u000b\u1409\u0007\f\u1409\u0004", new Object[] { "b", "c", "d", aora.class, "f", "g", "i", ahyq.class, "j", "n", "l", "o", "e", "k", "h" });
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
