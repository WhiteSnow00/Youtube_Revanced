import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitm extends agzi implements ahax
{
    public static final aitm a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public aibc e;
    public agyc f;
    public agzy g;
    public boolean h;
    private ajsq j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(aitm.class, a = new aitm());
    }
    
    private aitm() {
        this.l = 2;
        this.f = agyc.b;
        this.g = agzi.emptyProtobufList();
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
                final ahbe i;
                if ((i = aitm.i) == null) {
                    synchronized (aitm.class) {
                        if (aitm.i == null) {
                            aitm.i = (ahbe)new agzb((agzi)aitm.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aitm.a;
            }
            case 4: {
                return new agza((agzi)aitm.a);
            }
            case 3: {
                return new aitm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitm.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u100a\u0005\u0005\u1409\u0002\u0006\u1409\u0001\u0007\u041b\t\u1007\u0007", new Object[] { "b", "j", "e", "k", "f", "d", "c", "g", aioe.class, "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
