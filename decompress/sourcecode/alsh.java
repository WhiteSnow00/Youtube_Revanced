import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsh extends agzi implements ahax
{
    public static final alsh a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private aibc e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(alsh.class, a = new alsh());
    }
    
    private alsh() {
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
                final ahbe b2;
                if ((b2 = alsh.b) == null) {
                    synchronized (alsh.class) {
                        if (alsh.b == null) {
                            alsh.b = (ahbe)new agzb((agzi)alsh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alsh.a;
            }
            case 4: {
                return new agza((agzi)alsh.a);
            }
            case 3: {
                return new alsh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
