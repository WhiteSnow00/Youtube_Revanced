import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgc extends ahbh implements ahcw
{
    public static final akgc a;
    private static volatile ahdd u;
    public int b;
    public aotp c;
    public ahbx d;
    public anuv e;
    public ajut f;
    public akga g;
    public ahab h;
    public aiqj i;
    public aiqj j;
    public String k;
    public alxx l;
    public apkr m;
    public anuv n;
    public int o;
    public int p;
    public int q;
    public int r;
    public anuv s;
    public int t;
    private ahko v;
    private akgb w;
    private ahhu x;
    private aiqj y;
    private byte z;
    
    static {
        ahbh.registerDefaultInstance((Class)akgc.class, (ahbh)(a = new akgc()));
    }
    
    private akgc() {
        this.z = 2;
        this.d = emptyProtobufList();
        this.h = ahab.b;
        this.k = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte z = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd u;
                if ((u = akgc.u) == null) {
                    synchronized (akgc.class) {
                        if (akgc.u == null) {
                            akgc.u = (ahdd)new ahba((ahbh)akgc.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return akgc.a;
            }
            case 4: {
                return new ahaz((ahbh)akgc.a);
            }
            case 3: {
                return new akgc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgc.a, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0001\r\u0001\u1409\u0001\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u1409\u0006\u0005\u100a\u0007\u0006\u1409\b\u0007\u1008\n\b\u1409\t\t\u1409\u000b\f\u041b\r\u1009\u000e\u000f\u1409\u0003\u0010\u1009\u0010\u0011\u1409\u0011\u0012\u100c\u0012\u0013\u100c\u0013\u0014\u100c\u0014\u0015\u1409\u0002\u0016\u1409\u0000\u0017\u100c\u0015\u0018\u100c\u0018\u0019\u1409\u0017", new Object[] { "b", "c", "f", "g", "x", "h", "i", "k", "j", "y", "d", aotd.class, "l", "e", "m", "n", "o", akgf.a(), "p", akfg.a(), "q", akfu.a(), "w", "v", "r", akge.a(), "t", akeh.e, "s" });
            }
            case 1: {
                if (o == null) {
                    z = 0;
                }
                this.z = z;
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
