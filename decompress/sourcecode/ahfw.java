import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfw extends agzi implements ahax
{
    public static final ahfw a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private afqb e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahfw.class, a = new ahfw());
    }
    
    private ahfw() {
        this.f = 2;
        emptyIntList();
        agzi.emptyProtobufList();
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
                final ahbe d;
                if ((d = ahfw.d) == null) {
                    synchronized (ahfw.class) {
                        if (ahfw.d == null) {
                            ahfw.d = (ahbe)new agzb((agzi)ahfw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahfw.a;
            }
            case 4: {
                return new agza((agzi)ahfw.a);
            }
            case 3: {
                return new ahfw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfw.a, "\u0001\u0002\u0000\u0001\u0001«\u0002\u0000\u0000\u0001\u0001\u1004\u0000«\u1409\u0006", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
