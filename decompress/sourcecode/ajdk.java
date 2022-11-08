import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdk extends agzi implements ahax
{
    public static final ajdk a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public ajsq d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ajdk.class, a = new ajdk());
    }
    
    private ajdk() {
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
                final ahbe e;
                if ((e = ajdk.e) == null) {
                    synchronized (ajdk.class) {
                        if (ajdk.e == null) {
                            ajdk.e = (ahbe)new agzb((agzi)ajdk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajdk.a;
            }
            case 4: {
                return new agza((agzi)ajdk.a);
            }
            case 3: {
                return new ajdk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1003\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
