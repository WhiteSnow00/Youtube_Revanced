import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apov extends agzi implements ahax
{
    public static final apov a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)apov.class, (agzi)(a = new apov()));
    }
    
    private apov() {
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
                if ((g = apov.g) == null) {
                    synchronized (apov.class) {
                        if (apov.g == null) {
                            apov.g = (ahbe)new agzb((agzi)apov.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apov.a;
            }
            case 4: {
                return new agza((agzi)apov.a);
            }
            case 3: {
                return new apov();
            }
            case 2: {
                return newMessageInfo((MessageLite)apov.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "h" });
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
