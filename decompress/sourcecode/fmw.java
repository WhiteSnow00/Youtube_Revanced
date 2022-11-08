import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmw extends agzi implements ahax
{
    public static final fmw a;
    private static volatile ahbe o;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public long i;
    public ahas j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    
    static {
        agzi.registerDefaultInstance((Class)fmw.class, (agzi)(a = new fmw()));
    }
    
    private fmw() {
        this.j = ahas.a;
        this.c = "";
        this.k = true;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = fmw.o) == null) {
                    synchronized (fmw.class) {
                        if (fmw.o == null) {
                            fmw.o = (ahbe)new agzb((agzi)fmw.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return fmw.a;
            }
            case 4: {
                return new agza((agzi)fmw.a);
            }
            case 3: {
                return new fmw();
            }
            case 2: {
                return newMessageInfo((MessageLite)fmw.a, "\u0001\f\u0000\u0001\u0001\f\f\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b2\t\u1007\u0007\n\u1002\b\u000b\u1002\t\f\u1004\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", fmv.a, "k", "l", "m", "n" });
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
