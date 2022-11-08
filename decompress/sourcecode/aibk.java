import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibk extends agzi implements ahax
{
    public static final aibk a;
    private static volatile ahbe x;
    private ahfw A;
    private byte B;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public boolean f;
    public akbf g;
    public ajsq h;
    public String i;
    public aibj j;
    public aioe k;
    public aioe l;
    public akbf m;
    public ajsq n;
    public String o;
    public aioe p;
    public aibl q;
    public ahgn r;
    public ahgn s;
    public String t;
    public boolean u;
    public aioe v;
    public agyc w;
    private aioe y;
    private aioe z;
    
    static {
        agzi.registerDefaultInstance((Class)aibk.class, (agzi)(a = new aibk()));
    }
    
    private aibk() {
        this.c = 0;
        this.B = 2;
        this.i = "";
        this.o = "";
        this.t = "";
        this.w = agyc.b;
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
                final ahbe x;
                if ((x = aibk.x) == null) {
                    synchronized (aibk.class) {
                        if (aibk.x == null) {
                            aibk.x = (ahbe)new agzb((agzi)aibk.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return aibk.a;
            }
            case 4: {
                return new agza((agzi)aibk.a);
            }
            case 3: {
                return new aibk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibk.a, "\u0001\u0018\u0001\u0001\u0001\u001d\u0018\u0000\u0000\f\u0001\u103c\u0000\u0003\u1007\u0003\u0004\u1007\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\t\b\u1409\f\t\u1409\r\n\u1409\u000f\f\u1409\u001a\r\u100a\u001b\u000e\u1008\u0007\u000f\u1008\u000e\u0010\u1009\u0011\u0011\u1409\n\u0012\u1409\b\u0013\u1009\u0014\u0014\u1009\u0015\u0017\u103c\u0000\u0018\u1008\u0017\u001a\u1007\u0018\u001b\u1409\u0019\u001c\u1409\u000b\u001d\u1409\u0010", new Object[] { "d", "c", "b", aibl.class, "e", "f", "g", "h", "k", "m", "n", "p", "A", "w", "i", "o", "q", "l", "j", "r", "s", aiba.class, "t", "u", "v", "y", "z" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.B = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.B;
            }
        }
    }
}
