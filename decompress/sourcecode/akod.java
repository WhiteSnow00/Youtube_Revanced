import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akod extends agzi implements ahax
{
    public static final akod a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public agyc d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akod.class, a = new akod());
    }
    
    private akod() {
        this.f = 2;
        this.d = agyc.b;
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
                if ((e = akod.e) == null) {
                    synchronized (akod.class) {
                        if (akod.e == null) {
                            akod.e = (ahbe)new agzb((agzi)akod.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akod.a;
            }
            case 4: {
                return new agza((agzi)akod.a);
            }
            case 3: {
                return new akod();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akod.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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