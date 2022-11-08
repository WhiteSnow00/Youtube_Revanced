import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxe extends agzi implements ahax
{
    public static final aoxe a;
    private static volatile ahbe g;
    public int b;
    public ajsq c;
    public ajsq d;
    public aibc e;
    public aoxd f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aoxe.class, a = new aoxe());
    }
    
    private aoxe() {
        this.i = 2;
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
                final ahbe g;
                if ((g = aoxe.g) == null) {
                    synchronized (aoxe.class) {
                        if (aoxe.g == null) {
                            aoxe.g = (ahbe)new agzb((agzi)aoxe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoxe.a;
            }
            case 4: {
                return new agza((agzi)aoxe.a);
            }
            case 3: {
                return new aoxe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoxe.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
