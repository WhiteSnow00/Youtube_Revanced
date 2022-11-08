import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwm extends agzi implements ahax
{
    public static final ahwm a;
    private static volatile ahbe l;
    public int b;
    public int c;
    public Object d;
    public ajsq e;
    public ajsq f;
    public int g;
    public ahwl h;
    public ahwl i;
    public ahwn j;
    public agyc k;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(ahwm.class, a = new ahwm());
    }
    
    private ahwm() {
        this.c = 0;
        this.n = 2;
        this.k = agyc.b;
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
                final ahbe l;
                if ((l = ahwm.l) == null) {
                    synchronized (ahwm.class) {
                        if (ahwm.l == null) {
                            ahwm.l = (ahbe)new agzb((agzi)ahwm.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ahwm.a;
            }
            case 4: {
                return new agza((agzi)ahwm.a);
            }
            case 3: {
                return new ahwm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwm.a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u103c\u0000\u0004\u100b\u0005\u0005\u1409\t\u0006\u100a\n\u0007\u143c\u0000\b\u1409\u0006\t\u1009\b\n\u1409\u0007\u000b\u143c\u0000", new Object[] { "d", "c", "b", "e", "f", ahwo.class, "g", "m", "k", aorm.class, "h", "j", "i", ahwq.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
