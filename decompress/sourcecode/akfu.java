import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfu extends agzd implements agze
{
    public static final akfu a;
    private static volatile ahbe u;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public String f;
    public String g;
    public ampi h;
    public boolean i;
    public aiap j;
    public boolean k;
    public agzq m;
    public agzy n;
    public int o;
    public int p;
    public ajcf q;
    public akfv r;
    public amch s;
    public aizo t;
    private akvb v;
    private aozk w;
    private byte x;
    
    static {
        agzi.registerDefaultInstance((Class)akfu.class, (agzi)(a = new akfu()));
    }
    
    private akfu() {
        this.x = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.m = emptyIntList();
        this.n = emptyProtobufList();
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
                final ahbe u;
                if ((u = akfu.u) == null) {
                    synchronized (akfu.class) {
                        if (akfu.u == null) {
                            akfu.u = (ahbe)new agzb((agzi)akfu.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return akfu.a;
            }
            case 4: {
                return new agzc(akfu.a);
            }
            case 3: {
                return new akfu();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfu.a, "\u0001\u0013\u0000\u0001\u0001&\u0013\u0000\u0002\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0007\u1008\u0004\n\u1409\t\u000b\u1008\u0003\u000f\u1007\r\u0012\u1009\u0010\u0016\u1409\u0014\u0019\u1007\u0016\u001a\u1009\u000b\u001b\u0016\u001c\u001b\u001d\u100c\u0017\u001f\u100c\u0019 \u1009\u001a!\u1009\u001b%\u1009\u001d&\u1009\u001e", new Object[] { "b", "c", "d", "e", "g", "v", "f", "i", "j", "w", "k", "h", "m", "n", anpl.class, "o", akce.l, "p", ahzk.o, "q", "r", "s", "t" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.x = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
