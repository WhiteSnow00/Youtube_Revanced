import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apix extends agzi implements ahax
{
    public static final apix a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private apiw f;
    private ajsq g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apix.class, a = new apix());
    }
    
    private apix() {
        this.j = 2;
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
                if ((b2 = apix.b) == null) {
                    synchronized (apix.class) {
                        if (apix.b == null) {
                            apix.b = (ahbe)new agzb((agzi)apix.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apix.a;
            }
            case 4: {
                return new agza((agzi)apix.a);
            }
            case 3: {
                return new apix();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apix.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u0004\t\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
