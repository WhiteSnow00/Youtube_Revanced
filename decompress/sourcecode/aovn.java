import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovn extends agzi implements ahax
{
    public static final aovn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private aovp g;
    private aovo h;
    private ajsq i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aovn.class, a = new aovn());
    }
    
    private aovn() {
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
                if ((b2 = aovn.b) == null) {
                    synchronized (aovn.class) {
                        if (aovn.b == null) {
                            aovn.b = (ahbe)new agzb((agzi)aovn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovn.a;
            }
            case 4: {
                return new agza((agzi)aovn.a);
            }
            case 3: {
                return new aovn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovn.a, "\u0001\u0007\u0000\u0001\u0002\f\u0007\u0000\u0000\u0007\u0002\u1409\u0001\u0005\u1409\u0006\u0006\u1409\b\u0007\u1409\u0005\n\u1409\u000b\u000b\u1409\u0007\f\u1409\f", new Object[] { "c", "d", "f", "h", "e", "i", "g", "j" });
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
