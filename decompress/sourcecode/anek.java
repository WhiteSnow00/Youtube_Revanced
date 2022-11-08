import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anek extends agzi implements ahax
{
    public static final anek a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ajsq h;
    private ajsq i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(anek.class, a = new anek());
    }
    
    private anek() {
        this.k = 2;
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
                if ((b2 = anek.b) == null) {
                    synchronized (anek.class) {
                        if (anek.b == null) {
                            anek.b = (ahbe)new agzb((agzi)anek.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anek.a;
            }
            case 4: {
                return new agza((agzi)anek.a);
            }
            case 3: {
                return new anek();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anek.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
