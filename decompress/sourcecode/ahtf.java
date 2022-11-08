import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtf extends agzi implements ahax
{
    public static final ahtf a;
    private static volatile ahbe i;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public agzy g;
    public agzy h;
    private int j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahtf.class, a = new ahtf());
    }
    
    private ahtf() {
        this.k = 2;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = agzi.emptyProtobufList();
        this.h = agzi.emptyProtobufList();
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
                if ((i = ahtf.i) == null) {
                    synchronized (ahtf.class) {
                        if (ahtf.i == null) {
                            ahtf.i = (ahbe)new agzb((agzi)ahtf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahtf.a;
            }
            case 4: {
                return new agza((agzi)ahtf.a);
            }
            case 3: {
                return new ahtf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtf.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0002\u0001\u1008\u0000\u0002\u1008\u0003\u0003\u1008\u0004\u0004\u1008\u0005\u0005\u1007\u0006\u0006\u041b\b\u041b", new Object[] { "j", "b", "c", "d", "e", "f", "g", aioe.class, "h", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
