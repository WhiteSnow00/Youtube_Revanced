import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplg extends agzi implements ahax
{
    public static final aplg a;
    private static volatile ahbe e;
    public int b;
    public aorm c;
    public ajsq d;
    private aokl f;
    private aioe g;
    private ajsq h;
    private ajsq i;
    private aplh j;
    private amdz k;
    private anss l;
    private anss m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(aplg.class, a = new aplg());
    }
    
    private aplg() {
        this.o = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe e;
                if ((e = aplg.e) == null) {
                    synchronized (aplg.class) {
                        if (aplg.e == null) {
                            aplg.e = (ahbe)new agzb((agzi)aplg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aplg.a;
            }
            case 4: {
                return new agza((agzi)aplg.a);
            }
            case 3: {
                return new aplg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplg.a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\n\u000b\u1409\u0007\u000e\u1409\t\u000f\u1409\u0005\u0010\u1409\b", new Object[] { "b", "c", "d", "f", "g", "h", "j", "n", "k", "m", "i", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
