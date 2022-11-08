import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aong extends agzi implements ahax
{
    public static final aong a;
    private static volatile ahbe p;
    public int b;
    public aoni c;
    public agzy d;
    public agzy e;
    public ajsq f;
    public aioe g;
    public aibc h;
    public aibc i;
    public agzy j;
    public agyc k;
    public agzy l;
    public int m;
    public aonk n;
    public int o;
    private ajsq q;
    private aioe r;
    private ahfw s;
    private byte t;
    
    static {
        agzi.registerDefaultInstance((Class)aong.class, (agzi)(a = new aong()));
    }
    
    private aong() {
        this.t = 2;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = agyc.b;
        this.l = emptyProtobufList();
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
                final ahbe p3;
                if ((p3 = aong.p) == null) {
                    synchronized (aong.class) {
                        if (aong.p == null) {
                            aong.p = (ahbe)new agzb((agzi)aong.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aong.a;
            }
            case 4: {
                return new agza((agzi)aong.a);
            }
            case 3: {
                return new aong();
            }
            case 2: {
                return newMessageInfo((MessageLite)aong.a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0004\n\u0001\u1409\u0001\u0002\u041b\u0003\u1409\t\u0004\u100a\n\u0005\u1409\u0002\u0006\u1409\u0003\t\u100c\r\n\u041b\u000b\u1009\u0000\r\u1409\u0006\u000f\u1409\u0004\u0010\u1409\u0005\u0011\u1009\u000e\u0012\u1004\u000f\u0013\u041b\u0014\u001b", new Object[] { "b", "f", "j", aonh.class, "s", "k", "q", "g", "m", aoiz.u, "d", aone.class, "c", "r", "h", "i", "n", "o", "e", aioe.class, "l", aomp.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.t = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
