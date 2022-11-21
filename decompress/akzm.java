import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzm extends ahcz implements aheo
{
    public static final ahdi a;
    public static final akzm b;
    private static volatile ahev o;
    public int c;
    public long d;
    public ahdp e;
    public ahdp f;
    public ahdp g;
    public String h;
    public String i;
    public String j;
    public String k;
    public float l;
    public String m;
    public ahdh n;
    private byte p;
    
    static {
        a = (ahdi)new alxv(1);
        ahcz.registerDefaultInstance(akzm.class, b = new akzm());
    }
    
    private akzm() {
        this.p = 2;
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        this.h = "";
        this.i = "";
        this.j = "";
        emptyProtobufList();
        this.k = "";
        this.m = "";
        this.n = ahcz.emptyIntList();
    }
    
    public final void a() {
        final ahdp f = this.f;
        if (!f.c()) {
            this.f = ahcz.mutableCopy(f);
        }
    }
    
    public final void b() {
        final ahdp e = this.e;
        if (!e.c()) {
            this.e = ahcz.mutableCopy(e);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = akzm.o) == null) {
                    synchronized (akzm.class) {
                        if (akzm.o == null) {
                            akzm.o = (ahev)new ahcs((ahcz)akzm.b);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return akzm.b;
            }
            case 4: {
                return new ahcr((float[][])null, (boolean[][])null);
            }
            case 3: {
                return new akzm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzm.b, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0004\u0003\u0001\u1002\u0000\u0002\u041b\u0003\u041b\u0004\u1008\u0001\u0005\u1008\u0002\u0007\u1008\u0004\r\u1001\u0007\u000e\u1008\u0005\u000f\u1008\b\u0010\u041b\u0011\u001e", new Object[] { "c", "d", "e", ajwl.class, "f", ajwl.class, "h", "i", "j", "l", "k", "m", "g", amjy.class, "n", ajsh.a() });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
