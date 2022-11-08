import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknf extends agzi implements ahax
{
    public static final aknf a;
    private static volatile ahbe i;
    public String b;
    public boolean c;
    public int d;
    public long e;
    public agzy f;
    public akno g;
    public aknh h;
    private int j;
    private aknp k;
    private aknn l;
    private aknl m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(aknf.class, a = new aknf());
    }
    
    private aknf() {
        this.n = 2;
        this.b = "";
        this.f = agzi.emptyProtobufList();
        emptyProtobufList();
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
                final ahbe i;
                if ((i = aknf.i) == null) {
                    synchronized (aknf.class) {
                        if (aknf.i == null) {
                            aknf.i = (ahbe)new agzb((agzi)aknf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aknf.a;
            }
            case 4: {
                return new agza((agzi)aknf.a);
            }
            case 3: {
                return new aknf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknf.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0006\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0007\u041b\b\u1409\u0007\t\u1409\b\n\u1409\f\u000e\u1409\t\u0011\u1409\u000b", new Object[] { "j", "b", "c", "d", akhl.m, "e", "f", aknm.class, "g", "k", "h", "l", "m" });
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
