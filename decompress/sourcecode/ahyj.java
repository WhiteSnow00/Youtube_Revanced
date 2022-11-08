import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyj extends agzi implements ahax
{
    public static final ahyj a;
    private static volatile ahbe d;
    public int b;
    public ajsq c;
    private aioe e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahyj.class, a = new ahyj());
    }
    
    private ahyj() {
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
                if ((d = ahyj.d) == null) {
                    synchronized (ahyj.class) {
                        if (ahyj.d == null) {
                            ahyj.d = (ahbe)new agzb((agzi)ahyj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahyj.a;
            }
            case 4: {
                return new agza((agzi)ahyj.a);
            }
            case 3: {
                return new ahyj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyj.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "b", "c", "e" });
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
