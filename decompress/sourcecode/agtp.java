import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtp extends agzi implements ahax
{
    public static final agtp a;
    private static volatile ahbe r;
    public int b;
    public float c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public agzy l;
    public agzy m;
    public int n;
    public String o;
    public agto p;
    public int q;
    
    static {
        agzi.registerDefaultInstance(agtp.class, a = new agtp());
    }
    
    private agtp() {
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = "";
        this.l = agzi.emptyProtobufList();
        this.m = agzi.emptyProtobufList();
        this.o = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe r;
                if ((r = agtp.r) == null) {
                    synchronized (agtp.class) {
                        if (agtp.r == null) {
                            agtp.r = (ahbe)new agzb((agzi)agtp.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return agtp.a;
            }
            case 4: {
                return new agza((short[][][])null);
            }
            case 3: {
                return new agtp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtp.a, "\u0001\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0002\u0000\u0002\u1001\u0000\u0003\u100c\u0001\u0004\u1008\u0002\u0005\u1008\u0003\u0006\u1008\u0004\u0007\u1008\u0005\b\u1008\u0006\t\u1004\u0007\n\u1008\b\f\u001b\r\u001b\u000e\u100c\n\u000f\u1008\u000b\u0010\u1009\f\u0011\u100c\r", new Object[] { "b", "c", "d", afon.p, "e", "f", "g", "h", "i", "j", "k", "l", agsv.class, "m", agsu.class, "n", agte.g, "o", "p", "q", agte.i });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
