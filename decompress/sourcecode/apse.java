import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apse extends agzi implements ahax
{
    public static final apse a;
    private static volatile ahbe l;
    public int b;
    public Object c;
    public String d;
    public boolean e;
    public int f;
    public int g;
    public ahas h;
    public agzy i;
    public aioe j;
    public int k;
    private int m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)apse.class, (agzi)(a = new apse()));
    }
    
    private apse() {
        this.b = 0;
        this.h = ahas.a;
        this.o = 2;
        this.d = "";
        this.i = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe l;
                if ((l = apse.l) == null) {
                    synchronized (apse.class) {
                        if (apse.l == null) {
                            apse.l = (ahbe)new agzb((agzi)apse.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apse.a;
            }
            case 4: {
                return new agza((agzi)apse.a);
            }
            case 3: {
                return new apse();
            }
            case 2: {
                return newMessageInfo((MessageLite)apse.a, "\u0001\u000b\u0001\u0001\u0001\u000e\u000b\u0001\u0001\u0004\u0001\u103c\u0000\u0002\u1007\u0003\u0003\u1409\u0006\u0004\u1409\f\u0006\u100c\u0004\u0007\u1008\u0000\b\u0432\t\u041b\n\u100c\u0005\u000b\u100c\u0007\u000e\u103b\u0000", new Object[] { "c", "b", "m", afms.class, "e", "j", "n", "f", apsc.a, "d", "h", apsd.a, "i", apsf.class, "g", apsc.a, "k", apsc.d });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
