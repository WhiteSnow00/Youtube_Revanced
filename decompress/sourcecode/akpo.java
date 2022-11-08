import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpo extends agzi implements ahax
{
    public static final akpo a;
    private static volatile ahbe e;
    public akjf b;
    public boolean c;
    public boolean d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akpo.class, a = new akpo());
    }
    
    private akpo() {
        this.g = 2;
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
                if ((e = akpo.e) == null) {
                    synchronized (akpo.class) {
                        if (akpo.e == null) {
                            akpo.e = (ahbe)new agzb((agzi)akpo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpo.a;
            }
            case 4: {
                return new agza((agzi)akpo.a);
            }
            case 3: {
                return new akpo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpo.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1007\u0001\u0004\u1007\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
