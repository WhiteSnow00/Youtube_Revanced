import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopg extends agzi implements ahax
{
    public static final aopg a;
    private static volatile ahbe o;
    public int b;
    public String c;
    public aioe d;
    public String e;
    public boolean f;
    public akbf g;
    public aoph h;
    public aope i;
    public aopd j;
    public aopc k;
    public String l;
    public aopf m;
    public agyc n;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance((Class)aopg.class, (agzi)(a = new aopg()));
    }
    
    private aopg() {
        this.q = 2;
        this.c = "";
        this.e = "";
        this.l = "";
        this.n = agyc.b;
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
                final ahbe o3;
                if ((o3 = aopg.o) == null) {
                    synchronized (aopg.class) {
                        if (aopg.o == null) {
                            aopg.o = (ahbe)new agzb((agzi)aopg.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aopg.a;
            }
            case 4: {
                return new agza((agzi)aopg.a);
            }
            case 3: {
                return new aopg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopg.a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0007\u0001\u1409\u0001\u0002\u1008\u0002\u0003\u1007\u0003\u0004\u1409\r\u0006\u1409\u0005\u0007\u1409\u000b\b\u1409\f\t\u1009\t\n\u1409\u000f\u000b\u1008\u0000\r\u1409\u0012\u000e\u100a\u0013\u0010\u1008\u000e", new Object[] { "b", "d", "e", "f", "k", "g", "i", "j", "h", "m", "c", "p", "n", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
