import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyg extends agzi implements ahax
{
    public static final atyg a;
    private static volatile ahbe v;
    public int b;
    public long c;
    public String d;
    public String e;
    public atww f;
    public atxc g;
    public atxr h;
    public atxz i;
    public atwg j;
    public atxx k;
    public atxg l;
    public atwc m;
    public atyf n;
    public atxu o;
    public agzy p;
    public atxp q;
    public atyd r;
    public atxv s;
    public atwp t;
    public atxo u;
    private atxq w;
    private byte x;
    
    static {
        agzi.registerDefaultInstance(atyg.class, a = new atyg());
    }
    
    private atyg() {
        this.x = 2;
        this.d = "";
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
        this.p = agzi.emptyProtobufList();
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
                final ahbe v;
                if ((v = atyg.v) == null) {
                    synchronized (atyg.class) {
                        if (atyg.v == null) {
                            atyg.v = (ahbe)new agzb((agzi)atyg.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return atyg.a;
            }
            case 4: {
                return new agza((short[][][])null, (byte[][])null);
            }
            case 3: {
                return new atyg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atyg.a, "\u0001\u0014\u0000\u0001\u0001\"\u0014\u0000\u0001\b\u0001\u1409\u0003\u0002\u1005\u0000\u0003\u1008\u0001\u0005\u1009\u0018\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0019\t\u1009\u0007\n\u1409\b\f\u1009\n\u000e\u1409\u001b\u0010\u1409\f\u0011\u1008\u0002\u0015\u1009\u001c\u0017\u1009\u001a\u001d\u1409\u0015\u001e\u1009\u0016\u001f\u1009\u0017 \u1009\u0013\"\u001b", new Object[] { "b", "f", "c", "d", "q", "g", "h", "r", "i", "j", "k", "t", "l", "e", "u", "s", "w", "n", "o", "m", "p", atws.class });
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
