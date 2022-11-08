import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvl extends agzi implements ahax
{
    public static final ahvl a;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public agyc d;
    private ahfw f;
    private aizm g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahvl.class, a = new ahvl());
    }
    
    private ahvl() {
        this.h = 2;
        this.d = agyc.b;
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
                if ((e = ahvl.e) == null) {
                    synchronized (ahvl.class) {
                        if (ahvl.e == null) {
                            ahvl.e = (ahbe)new agzb((agzi)ahvl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahvl.a;
            }
            case 4: {
                return new agza((agzi)ahvl.a);
            }
            case 3: {
                return new ahvl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvl.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "f", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
