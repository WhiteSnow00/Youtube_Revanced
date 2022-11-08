import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpx extends agzi implements ahax
{
    public static final alpx a;
    public static final agzg b;
    private static volatile ahbe o;
    public int c;
    public agzy d;
    public alpv e;
    public agzy f;
    public alpw g;
    public alpu h;
    public agzy i;
    public agyc j;
    public String k;
    public boolean l;
    public anss m;
    public String n;
    private anss p;
    private ahfw q;
    private alpy r;
    private anss s;
    private byte t;
    
    static {
        final alpx a2 = new alpx();
        agzi.registerDefaultInstance(alpx.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ansr.a, a2, (MessageLite)a2, null, 117294427, ahcm.k, alpx.class);
    }
    
    private alpx() {
        this.t = 2;
        this.d = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        this.i = agzi.emptyProtobufList();
        this.j = agyc.b;
        this.k = "";
        this.n = "";
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
                if ((o3 = alpx.o) == null) {
                    synchronized (alpx.class) {
                        if (alpx.o == null) {
                            alpx.o = (ahbe)new agzb((agzi)alpx.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alpx.a;
            }
            case 4: {
                return new agza((agzi)alpx.a);
            }
            case 3: {
                return new alpx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpx.a, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0003\u000b\u0001\u041b\u0002\u041b\u0003\u1409\u0004\u0005\u1409\u0003\u0006\u1409\u0001\b\u1409\u0006\t\u100a\u0007\f\u041b\u000e\u1409\t\u000f\u1008\n\u0010\u1007\u000b\u0012\u1409\u0000\u0013\u1409\r\u0014\u1409\u000e\u0015\u1008\u000f", new Object[] { "c", "d", alpz.class, "f", aioe.class, "h", "g", "e", "q", "j", "i", ajmd.class, "r", "k", "l", "p", "s", "m", "n" });
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
