import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahej extends agzi implements ahax
{
    public static final ahej a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;
    
    static {
        agzi.registerDefaultInstance(ahej.class, a = new ahej());
    }
    
    private ahej() {
        this.c = "";
        this.h = -1L;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = ahej.j) == null) {
                    synchronized (ahej.class) {
                        if (ahej.j == null) {
                            ahej.j = (ahbe)new agzb((agzi)ahej.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahej.a;
            }
            case 4: {
                return new agza((agzi)ahej.a);
            }
            case 3: {
                return new ahej();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahej.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1004\u0004\u0006\u1002\u0005\u0007\u1007\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
