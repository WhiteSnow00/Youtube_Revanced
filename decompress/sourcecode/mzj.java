import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzj extends agzi implements ahax
{
    public static final mzj a;
    private static volatile ahbe o;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public long i;
    public int j;
    public String k;
    public int l;
    public int m;
    public boolean n;
    
    static {
        agzi.registerDefaultInstance(mzj.class, a = new mzj());
    }
    
    private mzj() {
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.i = -1L;
        this.k = "";
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = mzj.o) == null) {
                    synchronized (mzj.class) {
                        if (mzj.o == null) {
                            mzj.o = (ahbe)new agzb((agzi)mzj.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return mzj.a;
            }
            case 4: {
                return new agza((agzi)mzj.a);
            }
            case 3: {
                return new mzj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)mzj.a, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1008\u0006\u0013\u1002\u0018\u0017\u1004\u001e\u0019\u100c\b \u1008!!\u1008\u0004\"\u1004\"#\u1004#$\u1007$", new Object[] { "b", "c", "d", "e", "g", "i", "j", "h", aqtg.d, "k", "f", "l", "m", "n" });
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
