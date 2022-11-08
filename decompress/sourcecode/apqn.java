import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqn extends agzi implements ahax
{
    public static final apqn a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public aibc f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)apqn.class, (agzi)(a = new apqn()));
    }
    
    private apqn() {
        this.i = 2;
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
                final ahbe g;
                if ((g = apqn.g) == null) {
                    synchronized (apqn.class) {
                        if (apqn.g == null) {
                            apqn.g = (ahbe)new agzb((agzi)apqn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apqn.a;
            }
            case 4: {
                return new agza((agzi)apqn.a);
            }
            case 3: {
                return new apqn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqn.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "h" });
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
