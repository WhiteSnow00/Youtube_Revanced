import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akol extends agzi implements ahax
{
    public static final akol a;
    private static volatile ahbe d;
    public int b;
    public ajsq c;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akol.class, a = new akol());
    }
    
    private akol() {
        this.f = 2;
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
                final ahbe d;
                if ((d = akol.d) == null) {
                    synchronized (akol.class) {
                        if (akol.d == null) {
                            akol.d = (ahbe)new agzb((agzi)akol.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akol.a;
            }
            case 4: {
                return new agza((agzi)akol.a);
            }
            case 3: {
                return new akol();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akol.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "b", "c", "e" });
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
