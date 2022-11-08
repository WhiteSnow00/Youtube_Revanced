import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqm extends agzi implements ahax
{
    public static final apqm a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private apql f;
    private apqk g;
    private aobm h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)apqm.class, (agzi)(a = new apqm()));
    }
    
    private apqm() {
        this.j = 2;
        final agyc b = agyc.b;
    }
    
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
                if ((b2 = apqm.b) == null) {
                    synchronized (apqm.class) {
                        if (apqm.b == null) {
                            apqm.b = (ahbe)new agzb((agzi)apqm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apqm.a;
            }
            case 4: {
                return new agza((agzi)apqm.a);
            }
            case 3: {
                return new apqm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
