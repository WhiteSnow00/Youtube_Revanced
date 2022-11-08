import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyl extends agzi implements ahax
{
    public static final ajyl a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajyl.class, a = new ajyl());
    }
    
    private ajyl() {
        this.g = 2;
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
                final ahbe b2;
                if ((b2 = ajyl.b) == null) {
                    synchronized (ajyl.class) {
                        if (ajyl.b == null) {
                            ajyl.b = (ahbe)new agzb((agzi)ajyl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajyl.a;
            }
            case 4: {
                return new agza((agzi)ajyl.a);
            }
            case 3: {
                return new ajyl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyl.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0004\u1409\u0004\u0006\u1409\u0003", new Object[] { "c", "d", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
