import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidm extends agzi implements ahax
{
    public static final aidm a;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public ajsq d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aidm.class, (agzi)(a = new aidm()));
    }
    
    private aidm() {
        this.g = 2;
        final agyc b = agyc.b;
    }
    
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
                if ((e = aidm.e) == null) {
                    synchronized (aidm.class) {
                        if (aidm.e == null) {
                            aidm.e = (ahbe)new agzb((agzi)aidm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aidm.a;
            }
            case 4: {
                return new agza((agzi)aidm.a);
            }
            case 3: {
                return new aidm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidm.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "f" });
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
