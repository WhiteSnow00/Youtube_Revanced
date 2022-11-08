import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvm extends agzi implements ahax
{
    public static final ajvm a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajsq d;
    public aorm e;
    public ajvk f;
    public agzy g;
    private ajsq i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ajvm.class, a = new ajvm());
    }
    
    private ajvm() {
        this.j = 2;
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
                final ahbe h;
                if ((h = ajvm.h) == null) {
                    synchronized (ajvm.class) {
                        if (ajvm.h == null) {
                            ajvm.h = (ahbe)new agzb((agzi)ajvm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajvm.a;
            }
            case 4: {
                return new agza((agzi)ajvm.a);
            }
            case 3: {
                return new ajvm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1009\u0004\u0005\u001b\u0006\u1409\u0003", new Object[] { "b", "c", "d", "e", "f", "g", ajvl.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
