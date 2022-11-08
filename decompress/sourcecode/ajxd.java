import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxd extends agzi implements ahax
{
    public static final ajxd a;
    private static volatile ahbe m;
    public int b;
    public aorm c;
    public agzy d;
    public ajsq e;
    public int f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public aioe j;
    public amer k;
    public agyc l;
    private aioe n;
    private aibc o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(ajxd.class, a = new ajxd());
    }
    
    private ajxd() {
        this.q = 2;
        this.d = agzi.emptyProtobufList();
        this.l = agyc.b;
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
                final ahbe m;
                if ((m = ajxd.m) == null) {
                    synchronized (ajxd.class) {
                        if (ajxd.m == null) {
                            ajxd.m = (ahbe)new agzb((agzi)ajxd.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajxd.a;
            }
            case 4: {
                return new agza((agzi)ajxd.a);
            }
            case 3: {
                return new ajxd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxd.a, "\u0001\r\u0000\u0001\u0002\u000e\r\u0000\u0001\u000b\u0002\u1409\u0001\u0003\u041b\u0004\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\u000b\f\u100a\f\r\u1004\u0003\u000e\u1409\n", new Object[] { "b", "c", "d", aora.class, "e", "g", "h", "i", "j", "n", "k", "p", "l", "f", "o" });
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
