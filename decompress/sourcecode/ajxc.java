import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxc extends agzi implements ahax
{
    public static final ajxc a;
    private static volatile ahbe m;
    public int b;
    public anig c;
    public agzy d;
    public ajsq e;
    public int f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public aioe j;
    public amer k;
    public agyc l;
    private aibc n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(ajxc.class, a = new ajxc());
    }
    
    private ajxc() {
        this.p = 2;
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
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
                if ((m = ajxc.m) == null) {
                    synchronized (ajxc.class) {
                        if (ajxc.m == null) {
                            ajxc.m = (ahbe)new agzb((agzi)ajxc.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajxc.a;
            }
            case 4: {
                return new agza((agzi)ajxc.a);
            }
            case 3: {
                return new ajxc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxc.a, "\u0001\f\u0000\u0001\u0002\r\f\u0000\u0001\n\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u041b\n\u1409\n\u000b\u100a\u000b\f\u1004\u0003\r\u1409\t", new Object[] { "b", "c", "e", "g", "h", "i", "j", "k", "d", aora.class, "o", "l", "f", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
