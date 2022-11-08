import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyq extends agzi implements ahax
{
    public static final ahyq a;
    private static volatile ahbe g;
    public int b;
    public ahyu c;
    public ahys d;
    public ahyr e;
    public amfl f;
    private ahyw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahyq.class, a = new ahyq());
    }
    
    private ahyq() {
        this.i = 2;
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
                final ahbe g;
                if ((g = ahyq.g) == null) {
                    synchronized (ahyq.class) {
                        if (ahyq.g == null) {
                            ahyq.g = (ahbe)new agzb((agzi)ahyq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahyq.a;
            }
            case 4: {
                return new agza((agzi)ahyq.a);
            }
            case 3: {
                return new ahyq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyq.a, "\u0001\u0005\u0000\u0001\ue5d8\u1848\ue496\u3d35\u0005\u0000\u0000\u0005\ue5d8\u1848\u1409\u0004\uf03a\u2b94\u1409\u0000\ufb65\u31c3\u1409\u0001\ue5b3\u31ca\u1409\u0002\ue496\u3d35\u1409\u0003", new Object[] { "b", "h", "c", "d", "e", "f" });
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
