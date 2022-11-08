import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmx extends agzi implements ahax
{
    public static final ajmx a;
    private static volatile ahbe z;
    private ajsq A;
    private aioe B;
    private ahfw C;
    private byte D;
    public int b;
    public int c;
    public aorm d;
    public aorm e;
    public ajsq f;
    public ajsq g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public ajsq n;
    public ajsq o;
    public ajsq p;
    public ajsq q;
    public ajsq r;
    public ajsq s;
    public aioe t;
    public ajmw u;
    public agzy v;
    public agzy w;
    public agzy x;
    public agyc y;
    
    static {
        agzi.registerDefaultInstance((Class)ajmx.class, (agzi)(a = new ajmx()));
    }
    
    private ajmx() {
        this.D = 2;
        emptyProtobufList();
        this.v = emptyProtobufList();
        this.w = emptyProtobufList();
        this.x = emptyProtobufList();
        this.y = agyc.b;
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
                final ahbe z;
                if ((z = ajmx.z) == null) {
                    synchronized (ajmx.class) {
                        if (ajmx.z == null) {
                            ajmx.z = (ahbe)new agzb((agzi)ajmx.a);
                        }
                    }
                }
                return z;
            }
            case 5: {
                return ajmx.a;
            }
            case 4: {
                return new agza((agzi)ajmx.a);
            }
            case 3: {
                return new ajmx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmx.a, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0003\u000f\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1001\u0006\u0007\u1001\u0007\b\u1001\b\t\u1001\t\n\u1002\n\u000b\u1002\u000b\f\u1409\f\r\u1409\r\u000e\u1409\u0011\u000f\u1409\u0012\u0010\u1409\u0013\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u1409\u0014\u0016\u1409\u0010\u0017\u1409\u0019\u0018\u100a\u001a\u001b\u1409\u0017\u001d\u1409\u000e\u001e\u1409\u000f", new Object[] { "b", "c", ajkr.g, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "r", "s", "t", "v", alud.class, "w", alud.class, "x", alud.class, "u", "A", "C", "y", "B", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.D = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
