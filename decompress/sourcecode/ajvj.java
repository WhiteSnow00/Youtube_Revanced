import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvj extends agzi implements ahax
{
    public static final ajvj a;
    private static volatile ahbe k;
    public int b;
    public ajsq c;
    public ajsq d;
    public aibc e;
    public aorm f;
    public akbf g;
    public aorm h;
    public aioe i;
    public agyc j;
    private aioe l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(ajvj.class, a = new ajvj());
    }
    
    private ajvj() {
        this.n = 2;
        this.j = agyc.b;
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
                final ahbe k;
                if ((k = ajvj.k) == null) {
                    synchronized (ajvj.class) {
                        if (ajvj.k == null) {
                            ajvj.k = (ahbe)new agzb((agzi)ajvj.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajvj.a;
            }
            case 4: {
                return new agza((agzi)ajvj.a);
            }
            case 3: {
                return new ajvj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvj.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\n\t\u100a\u000b\n\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
