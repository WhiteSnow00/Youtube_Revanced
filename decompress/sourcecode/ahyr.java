import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyr extends agzi implements ahax
{
    public static final ahyr a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public ajsq d;
    public akbf e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahyr.class, a = new ahyr());
    }
    
    private ahyr() {
        this.h = 2;
        this.c = "";
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
                final ahbe f;
                if ((f = ahyr.f) == null) {
                    synchronized (ahyr.class) {
                        if (ahyr.f == null) {
                            ahyr.f = (ahbe)new agzb((agzi)ahyr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahyr.a;
            }
            case 4: {
                return new agza((agzi)ahyr.a);
            }
            case 3: {
                return new ahyr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyr.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "b", "c", "d", "g", "e" });
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
