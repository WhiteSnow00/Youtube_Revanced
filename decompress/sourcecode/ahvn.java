import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvn extends agzi implements ahax
{
    public static final ahvn a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public aioe d;
    public ahvm e;
    public aioe f;
    public ahvm g;
    public aioe h;
    public ahvm i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahvn.class, a = new ahvn());
    }
    
    private ahvn() {
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
                if ((j = ahvn.j) == null) {
                    synchronized (ahvn.class) {
                        if (ahvn.j == null) {
                            ahvn.j = (ahbe)new agzb((agzi)ahvn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahvn.a;
            }
            case 4: {
                return new agza((agzi)ahvn.a);
            }
            case 3: {
                return new ahvn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvn.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0006", new Object[] { "b", "c", ahse.m, "d", "f", "h", "e", "g", "i" });
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
