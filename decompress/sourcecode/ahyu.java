import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyu extends agzi implements ahax
{
    public static final ahyu a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public ahyv g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahyu.class, a = new ahyu());
    }
    
    private ahyu() {
        this.j = 2;
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
                final ahbe h;
                if ((h = ahyu.h) == null) {
                    synchronized (ahyu.class) {
                        if (ahyu.h == null) {
                            ahyu.h = (ahbe)new agzb((agzi)ahyu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahyu.a;
            }
            case 4: {
                return new agza((agzi)ahyu.a);
            }
            case 3: {
                return new ahyu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyu.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0004\u1409\u0006\u0005\u1009\u0005\b\u1409\u0002\t\u1409\u0003", new Object[] { "b", "c", "d", "i", "g", "e", "f" });
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
