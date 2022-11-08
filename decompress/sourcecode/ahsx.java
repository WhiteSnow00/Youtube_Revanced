import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsx extends agzi implements ahax
{
    public static final ahsx a;
    private static volatile ahbe j;
    public int b;
    public aibc c;
    public ajsq d;
    public ajsq e;
    public float f;
    public int g;
    public int h;
    public int i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahsx.class, a = new ahsx());
    }
    
    private ahsx() {
        this.k = 2;
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
                final ahbe j;
                if ((j = ahsx.j) == null) {
                    synchronized (ahsx.class) {
                        if (ahsx.j == null) {
                            ahsx.j = (ahbe)new agzb((agzi)ahsx.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahsx.a;
            }
            case 4: {
                return new agza((agzi)ahsx.a);
            }
            case 3: {
                return new ahsx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsx.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1001\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ahho.g });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
