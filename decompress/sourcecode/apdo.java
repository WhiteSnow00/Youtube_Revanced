import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdo extends agzi implements ahax
{
    public static final apdo a;
    private static volatile ahbe d;
    public long b;
    public ajsq c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apdo.class, a = new apdo());
    }
    
    private apdo() {
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
                if ((d = apdo.d) == null) {
                    synchronized (apdo.class) {
                        if (apdo.d == null) {
                            apdo.d = (ahbe)new agzb((agzi)apdo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdo.a;
            }
            case 4: {
                return new agza((agzi)apdo.a);
            }
            case 3: {
                return new apdo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdo.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1003\u0000\u0003\u1409\u0002", new Object[] { "e", "b", "c" });
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
