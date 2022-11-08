import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitv extends agzi implements ahax
{
    public static final aitv a;
    private static volatile ahbe l;
    public int b;
    public aorm c;
    public ajsq d;
    public agzy e;
    public aioe f;
    public amer g;
    public ajsq h;
    public ajsq i;
    public ajsq j;
    public agyc k;
    private aioe m;
    private ajsq n;
    private ally o;
    private ahfw p;
    private ajsq q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(aitv.class, a = new aitv());
    }
    
    private aitv() {
        this.r = 2;
        this.e = agzi.emptyProtobufList();
        emptyProtobufList();
        this.k = agyc.b;
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
                final ahbe l;
                if ((l = aitv.l) == null) {
                    synchronized (aitv.class) {
                        if (aitv.l == null) {
                            aitv.l = (ahbe)new agzb((agzi)aitv.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aitv.a;
            }
            case 4: {
                return new agza((agzi)aitv.a);
            }
            case 3: {
                return new aitv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitv.a, "\u0001\u000e\u0000\u0001\u0002\u0013\u000e\u0000\u0001\r\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0007\u1409\b\b\u1409\u000f\t\u1409\u0005\n\u1409\n\u000b\u1409\u000b\f\u100a\u0010\u000e\u1409\u0011\u000f\u1409\t\u0010\u1409\f\u0012\u1409\u0006\u0013\u041b", new Object[] { "b", "c", "d", "f", "h", "p", "m", "j", "n", "k", "q", "i", "o", "g", "e", aora.class });
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
