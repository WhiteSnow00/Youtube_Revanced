import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alql extends agzi implements ahax
{
    public static final alql a;
    private static volatile ahbe k;
    public String b;
    public aorm c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aioe h;
    public String i;
    public agzy j;
    private int l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(alql.class, a = new alql());
    }
    
    private alql() {
        this.n = 2;
        this.b = "";
        this.i = "";
        this.j = agzi.emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe k;
                if ((k = alql.k) == null) {
                    synchronized (alql.class) {
                        if (alql.k == null) {
                            alql.k = (ahbe)new agzb((agzi)alql.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return alql.a;
            }
            case 4: {
                return new agza((agzi)alql.a);
            }
            case 3: {
                return new alql();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alql.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u1409\u0006\b\u1008\u0007\n\u041b\u000b\u1409\t", new Object[] { "l", "b", "c", "d", "e", "f", "g", "h", "i", "j", aorm.class, "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
