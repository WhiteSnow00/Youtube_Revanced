import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomx extends agzi implements ahax
{
    public static final aomx a;
    private static volatile ahbe k;
    public int b;
    public agzy c;
    public agzy d;
    public ajsq e;
    public aioe f;
    public agzy g;
    public int h;
    public aibc i;
    public agyc j;
    private ajsq l;
    private aioe m;
    private aioe n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)aomx.class, (agzi)(a = new aomx()));
    }
    
    private aomx() {
        this.p = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.g = emptyProtobufList();
        emptyProtobufList();
        this.j = agyc.b;
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe k;
                if ((k = aomx.k) == null) {
                    synchronized (aomx.class) {
                        if (aomx.k == null) {
                            aomx.k = (ahbe)new agzb((agzi)aomx.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aomx.a;
            }
            case 4: {
                return new agza((agzi)aomx.a);
            }
            case 3: {
                return new aomx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomx.a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0003\n\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u041b\u0006\u1409\u0004\b\u100c\u0007\t\u1409\n\n\u100a\u000b\u000b\u1409\t\r\u1409\u0003\u0010\u041b", new Object[] { "b", "c", aomv.class, "e", "l", "f", "g", aomy.class, "n", "h", aoiz.u, "o", "j", "i", "m", "d", aioe.class });
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
