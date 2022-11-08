import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxe extends agzi implements ahax
{
    public static final ajxe a;
    private static volatile ahbe o;
    public int b;
    public aorm c;
    public agzy d;
    public ajsq e;
    public int f;
    public amer g;
    public aioe h;
    public ajsq i;
    public ajsq j;
    public ahyq k;
    public ahyq l;
    public ahyq m;
    public agyc n;
    private ajsq p;
    private aibc q;
    private ahfw r;
    private byte s;
    
    static {
        agzi.registerDefaultInstance(ajxe.class, a = new ajxe());
    }
    
    private ajxe() {
        this.s = 2;
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.n = agyc.b;
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
                final ahbe o3;
                if ((o3 = ajxe.o) == null) {
                    synchronized (ajxe.class) {
                        if (ajxe.o == null) {
                            ajxe.o = (ahbe)new agzb((agzi)ajxe.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajxe.a;
            }
            case 4: {
                return new agza((agzi)ajxe.a);
            }
            case 3: {
                return new ajxe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxe.a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0001\r\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1004\u0003\u0007\u1409\u0006\b\u1409\b\t\u041b\n\u1409\r\u000b\u100a\u000e\f\u1409\f\r\u1409\u0007\u0010\u1409\t\u0011\u1409\n\u0012\u1409\u000b", new Object[] { "b", "c", "e", "g", "h", "f", "p", "j", "d", aora.class, "r", "n", "q", "i", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.s = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
