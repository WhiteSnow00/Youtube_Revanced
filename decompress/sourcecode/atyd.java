import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyd extends agzi implements ahax
{
    public static final atyd a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    private atyb f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(atyd.class, a = new atyd());
    }
    
    private atyd() {
        this.g = 2;
        this.d = 1;
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
                if ((e = atyd.e) == null) {
                    synchronized (atyd.class) {
                        if (atyd.e == null) {
                            atyd.e = (ahbe)new agzb((agzi)atyd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atyd.a;
            }
            case 4: {
                return new agza((agzi)atyd.a);
            }
            case 3: {
                return new atyd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atyd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "b", "c", atyc.a(), "d", "f" });
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
