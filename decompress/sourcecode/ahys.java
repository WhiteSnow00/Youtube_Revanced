import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahys extends agzi implements ahax
{
    public static final ahys a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public akbf d;
    public String e;
    public ajsq f;
    public ahyt g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahys.class, a = new ahys());
    }
    
    private ahys() {
        this.j = 2;
        this.c = "";
        this.e = "";
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
                final ahbe h;
                if ((h = ahys.h) == null) {
                    synchronized (ahys.class) {
                        if (ahys.h == null) {
                            ahys.h = (ahbe)new agzb((agzi)ahys.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahys.a;
            }
            case 4: {
                return new agza((agzi)ahys.a);
            }
            case 3: {
                return new ahys();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahys.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0003\u0003\u1009\u0004\u0004\u1409\u0005\u0006\u1008\u0002\u0007\u1409\u0001", new Object[] { "b", "c", "f", "g", "i", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
