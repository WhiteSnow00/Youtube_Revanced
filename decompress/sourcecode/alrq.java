import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrq extends agzi implements ahax
{
    public static final alrq a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private aibc g;
    private aibc h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(alrq.class, a = new alrq());
    }
    
    private alrq() {
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
                final ahbe b2;
                if ((b2 = alrq.b) == null) {
                    synchronized (alrq.class) {
                        if (alrq.b == null) {
                            alrq.b = (ahbe)new agzb((agzi)alrq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alrq.a;
            }
            case 4: {
                return new agza((agzi)alrq.a);
            }
            case 3: {
                return new alrq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrq.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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