import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aook extends agzi implements ahax
{
    private static volatile ahbe L;
    public static final aook a;
    public long A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public ajde F;
    public long G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    private int M;
    public int b;
    public ahqc c;
    public ahry d;
    public boolean e;
    public boolean f;
    public ahsd g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public long z;
    
    static {
        agzi.registerDefaultInstance((Class)aook.class, (agzi)(a = new aook()));
    }
    
    private aook() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = aook.L) == null) {
                    synchronized (aook.class) {
                        if (aook.L == null) {
                            aook.L = (ahbe)new agzb((agzi)aook.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aook.a;
            }
            case 4: {
                return new agza((agzi)aook.a);
            }
            case 3: {
                return new aook();
            }
            case 2: {
                return newMessageInfo((MessageLite)aook.a, "\u0001#\u0000\u0002\u0003:#\u0000\u0000\u0000\u0003\u1009\u0002\u0004\u1009\u0003\b\u1007\u0007\r\u1009\u000e\u0010\u1004\u000f\u0013\u1007\u0012\u0015\u1004\u0014\u0017\u1007\u0016\u0018\u1001\u0017\u0019\u1007\u0018\u001b\u1007\u001a\u001c\u1007\u001b\u001d\u1007\u001c\u001e\u1002\u001d!\u100c #\u1002\"%\u1007%&\u1007\f)\u1007&*\u1007'+\u1002(,\u1002).\u1002#/\u1002+0\u1002,1\u1004-2\u1004.3\u1004/4\u100915\u100226\u100707\u100238\u100749\u10075:\u10076", new Object[] { "b", "M", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ahng.l, "s", "u", "f", "v", "w", "x", "y", "t", "z", "A", "B", "C", "D", "F", "G", "E", "H", "I", "J", "K" });
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
