import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqu extends agzi implements ahax
{
    public static final aoqu a;
    private static volatile ahbe d;
    public int b;
    public akbf c;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoqu.class, a = new aoqu());
    }
    
    private aoqu() {
        this.f = 2;
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
                if ((d = aoqu.d) == null) {
                    synchronized (aoqu.class) {
                        if (aoqu.d == null) {
                            aoqu.d = (ahbe)new agzb((agzi)aoqu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoqu.a;
            }
            case 4: {
                return new agza((agzi)aoqu.a);
            }
            case 3: {
                return new aoqu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "e", "c" });
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
