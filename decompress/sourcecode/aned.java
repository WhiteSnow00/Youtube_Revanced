import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aned extends agzi implements ahax
{
    public static final aned a;
    private static volatile ahbe d;
    public int b;
    public anec c;
    private anek e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aned.class, a = new aned());
    }
    
    private aned() {
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
                if ((d = aned.d) == null) {
                    synchronized (aned.class) {
                        if (aned.d == null) {
                            aned.d = (ahbe)new agzb((agzi)aned.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aned.a;
            }
            case 4: {
                return new agza((agzi)aned.a);
            }
            case 3: {
                return new aned();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aned.a, "\u0001\u0002\u0000\u0001\uedd3\u2bf1\uf9f7\u3d6f\u0002\u0000\u0000\u0002\uedd3\u2bf1\u1409\u0000\uf9f7\u3d6f\u1409\u0001", new Object[] { "b", "c", "e" });
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
