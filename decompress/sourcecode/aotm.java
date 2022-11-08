import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotm extends agzi implements ahax
{
    public static final aotm a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private anss f;
    private aibc g;
    private ahfw h;
    private aioe i;
    private aibc j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aotm.class, a = new aotm());
    }
    
    private aotm() {
        this.k = 2;
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = aotm.b) == null) {
                    synchronized (aotm.class) {
                        if (aotm.b == null) {
                            aotm.b = (ahbe)new agzb((agzi)aotm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aotm.a;
            }
            case 4: {
                return new agza((agzi)aotm.a);
            }
            case 3: {
                return new aotm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotm.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\b\u1409\u0005\t\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
