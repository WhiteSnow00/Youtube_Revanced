import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxk extends agzi implements ahax
{
    public static final ajxk a;
    private static volatile ahbe n;
    public int b;
    public aorm c;
    public ajsq d;
    public aioe e;
    public amer f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public ajsq j;
    public alvq k;
    public agyc l;
    public agzy m;
    private aioe o;
    private aioe p;
    private ahfw q;
    private ajsq r;
    private byte s;
    
    static {
        agzi.registerDefaultInstance(ajxk.class, a = new ajxk());
    }
    
    private ajxk() {
        this.s = 2;
        emptyProtobufList();
        this.l = agyc.b;
        this.m = agzi.emptyProtobufList();
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
                final ahbe n;
                if ((n = ajxk.n) == null) {
                    synchronized (ajxk.class) {
                        if (ajxk.n == null) {
                            ajxk.n = (ahbe)new agzb((agzi)ajxk.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajxk.a;
            }
            case 4: {
                return new agza((agzi)ajxk.a);
            }
            case 3: {
                return new ajxk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxk.a, "\u0001\u000f\u0000\u0001\u0002\u0014\u000f\u0000\u0001\r\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0007\u1409\t\b\u1409\u000f\t\u1409\u0006\n\u1409\u000b\u000b\u1409\f\f\u100a\u0010\u000e\u1409\u0011\u000f\u1409\n\u0010\u1409\u0007\u0012\u041b\u0013\u1009\u000e\u0014\u1409\u0005", new Object[] { "b", "c", "d", "e", "g", "q", "p", "i", "j", "l", "r", "h", "f", "m", aora.class, "k", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.s = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
