import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovi extends agzi implements ahax
{
    public static final aovi a;
    private static volatile ahbe b;
    private int c;
    private aovh d;
    private aovh e;
    private aovh f;
    private aovh g;
    private aovh h;
    private aovh i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aovi.class, a = new aovi());
    }
    
    private aovi() {
        this.j = 2;
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
                if ((b2 = aovi.b) == null) {
                    synchronized (aovi.class) {
                        if (aovi.b == null) {
                            aovi.b = (ahbe)new agzb((agzi)aovi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovi.a;
            }
            case 4: {
                return new agza((agzi)aovi.a);
            }
            case 3: {
                return new aovi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovi.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}