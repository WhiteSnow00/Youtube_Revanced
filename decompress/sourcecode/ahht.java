import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahht extends agzi implements ahax
{
    public static final ahht a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public agyc d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahht.class, a = new ahht());
    }
    
    private ahht() {
        this.f = 2;
        this.d = agyc.b;
        emptyProtobufList();
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
                if ((e = ahht.e) == null) {
                    synchronized (ahht.class) {
                        if (ahht.e == null) {
                            ahht.e = (ahbe)new agzb((agzi)ahht.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahht.a;
            }
            case 4: {
                return new agza((agzi)ahht.a);
            }
            case 3: {
                return new ahht();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahht.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
