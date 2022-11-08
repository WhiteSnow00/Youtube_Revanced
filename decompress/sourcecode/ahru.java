import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahru extends agzi implements ahax
{
    public static final ahru a;
    private static volatile ahbe e;
    public int b;
    public aorm c;
    public int d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahru.class, a = new ahru());
    }
    
    private ahru() {
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
                final ahbe e;
                if ((e = ahru.e) == null) {
                    synchronized (ahru.class) {
                        if (ahru.e == null) {
                            ahru.e = (ahbe)new agzb((agzi)ahru.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahru.a;
            }
            case 4: {
                return new agza((agzi)ahru.a);
            }
            case 3: {
                return new ahru();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahru.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", ampn.a() });
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
