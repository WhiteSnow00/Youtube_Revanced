import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfw extends agzd implements agze
{
    private static volatile ahbe A;
    public static final akfw a;
    private akfs B;
    private ahfw C;
    private anss D;
    private byte E;
    public int b;
    public akjf c;
    public akfr d;
    public anss e;
    public akfx f;
    public akfy g;
    public akft h;
    public ansr i;
    public agyc j;
    public akga k;
    public agzy m;
    public agzy n;
    public agzy o;
    public aioe p;
    public aioe q;
    public aioe r;
    public boolean s;
    public int t;
    public int u;
    public anss v;
    public agzy w;
    public ajtl x;
    public aioe y;
    public agzy z;
    
    static {
        agzi.registerDefaultInstance((Class)akfw.class, (agzi)(a = new akfw()));
    }
    
    private akfw() {
        this.E = 2;
        emptyProtobufList();
        this.j = agyc.b;
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.w = emptyProtobufList();
        this.z = emptyProtobufList();
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
                final ahbe a2;
                if ((a2 = akfw.A) == null) {
                    synchronized (akfw.class) {
                        if (akfw.A == null) {
                            akfw.A = (ahbe)new agzb((agzi)akfw.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return akfw.a;
            }
            case 4: {
                return new agzc(akfw.a);
            }
            case 3: {
                return new akfw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfw.a, "\u0001\u001a\u0000\u0001\u0001\u0309\u001a\u0000\u0005\u0015\u0001\u1409\u0000\t\u1409\u0006\n\u1409\t\f\u1409\u0005\r\u1409\u0001\u0010\u100a\f\u0012\u1409\u0007\u0014\u1409\b\u0017\u1409\u000b\u001c\u1409\u0011\u001d\u041b\u001e\u041b\u001f\u1007\u0015\"\u100b\u0016#\u100b\u0017$\u1409\u0013%\u1409\u0018&\u1409\u0012'\u1409\u0003(\u041b*\u1409\u0014+\u1409\u001a,\u041b-\u1409\u001b.\u001b\u0309\u1409\u0019", new Object[] { "b", "c", "f", "i", "B", "d", "j", "g", "h", "C", "k", "n", aioe.class, "o", aioe.class, "s", "t", "u", "q", "v", "p", "e", "m", anss.class, "r", "D", "w", anss.class, "y", "z", aiaq.class, "x" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.E = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.E;
            }
        }
    }
}
