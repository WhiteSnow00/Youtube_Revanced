import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocv extends agzi implements ahax
{
    public static final aocv a;
    private static volatile ahbe s;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    private int t;
    private int u;
    private int v;
    
    static {
        agzi.registerDefaultInstance(aocv.class, a = new aocv());
    }
    
    private aocv() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe s;
                if ((s = aocv.s) == null) {
                    synchronized (aocv.class) {
                        if (aocv.s == null) {
                            aocv.s = (ahbe)new agzb((agzi)aocv.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aocv.a;
            }
            case 4: {
                return new agza((agzi)aocv.a);
            }
            case 3: {
                return new aocv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocv.a, "\u0001\u0011\u0000\u0003\bM\u0011\u0000\u0000\u0000\b\u1007\u0007\u000b\u1007\n\u0010\u1007\u000f\u0011\u1007\u0010\u0012\u1004\u0011\u0013\u1004\u0012\u001b\u1007\u001a\u001e\u1007\u001d'\u1007()\u1007*.\u10042/\u100738\u100799\u10070>\u1007>C\u1007CM\u1007L", new Object[] { "t", "u", "v", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l", "p", "q", "r" });
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
