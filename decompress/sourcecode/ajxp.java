import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxp extends agzi implements ahax
{
    public static final ajxp a;
    private static volatile ahbe m;
    public int b;
    public ajsq c;
    public aoew d;
    public agzy e;
    public aioe f;
    public ajsq g;
    public ajsq h;
    public ahyq i;
    public amer j;
    public alvq k;
    public agyc l;
    private aioe n;
    private ahyq o;
    private anss p;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(ajxp.class, a = new ajxp());
    }
    
    private ajxp() {
        this.r = 2;
        this.e = agzi.emptyProtobufList();
        emptyProtobufList();
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
                if ((m = ajxp.m) == null) {
                    synchronized (ajxp.class) {
                        if (ajxp.m == null) {
                            ajxp.m = (ahbe)new agzb((agzi)ajxp.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajxp.a;
            }
            case 4: {
                return new agza((agzi)ajxp.a);
            }
            case 3: {
                return new ajxp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxp.a, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\t\t\u1409\u000b\n\u100a\f\u000b\u041b\r\u1409\u0003\u000e\u1409\b\u000f\u1409\u0006\u0012\u1009\n", new Object[] { "b", "c", "d", "f", "g", "h", "i", "j", "q", "l", "e", aora.class, "n", "p", "o", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
