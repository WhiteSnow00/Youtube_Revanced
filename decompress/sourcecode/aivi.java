import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivi extends agzi implements ahax
{
    public static final aivi a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public aibc d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aivi.class, a = new aivi());
    }
    
    private aivi() {
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
                final ahbe e;
                if ((e = aivi.e) == null) {
                    synchronized (aivi.class) {
                        if (aivi.e == null) {
                            aivi.e = (ahbe)new agzb((agzi)aivi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aivi.a;
            }
            case 4: {
                return new agza((agzi)aivi.a);
            }
            case 3: {
                return new aivi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivi.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0004\u1409\u0001", new Object[] { "b", "c", "f", "d" });
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
