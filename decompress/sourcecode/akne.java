import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akne extends agzi implements ahax
{
    public static final akne a;
    private static volatile ahbe j;
    public int b;
    public Object c;
    public akjf d;
    public aknb e;
    public agzy f;
    public int g;
    public agyc h;
    public anss i;
    private int k;
    private ahfw l;
    private anss m;
    private aioe n;
    private anss o;
    private ajtl p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(akne.class, a = new akne());
    }
    
    private akne() {
        this.b = 0;
        this.q = 2;
        this.f = agzi.emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe j;
                if ((j = akne.j) == null) {
                    synchronized (akne.class) {
                        if (akne.j == null) {
                            akne.j = (ahbe)new agzb((agzi)akne.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akne.a;
            }
            case 4: {
                return new agza((agzi)akne.a);
            }
            case 3: {
                return new akne();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akne.a, "\u0001\u000f\u0001\u0001\u0001\u0309\u000f\u0000\u0001\r\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u041b\u0005\u143c\u0000\u0006\u143c\u0000\u0007\u1409\u0007\b\u100a\b\n\u143c\u0000\u000b\u100c\u0006\f\u1409\t\u000e\u1409\u000b\u000f\u1409\f\u0010\u143c\u0000\u0011\u1409\r\u0309\u1409\u000e", new Object[] { "c", "b", "k", "d", "e", "f", akna.class, aknc.class, akmz.class, "l", "h", anss.class, "g", ahzk.g, "m", "n", "o", anss.class, "i", "p" });
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
