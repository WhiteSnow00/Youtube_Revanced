import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbe extends agzi implements ahax
{
    public static final apbe a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private apak h;
    private aibc i;
    private aibc j;
    private ajsq k;
    private aibc l;
    private aibc m;
    private aibc n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(apbe.class, a = new apbe());
    }
    
    private apbe() {
        this.p = 2;
        emptyProtobufList();
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
                if ((b2 = apbe.b) == null) {
                    synchronized (apbe.class) {
                        if (apbe.b == null) {
                            apbe.b = (ahbe)new agzb((agzi)apbe.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbe.a;
            }
            case 4: {
                return new agza((agzi)apbe.a);
            }
            case 3: {
                return new apbe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbe.a, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0000\f\u0002\u1409\u0002\u0003\u1409\u0005\u0004\u1409\u0007\u0006\u1409\u000f\u0007\u1409\b\b\u1409\u0004\t\u1409\t\f\u1409\n\r\u1409\u000b\u000e\u1409\f\u000f\u1409\r\u0011\u1409\u0003", new Object[] { "c", "d", "g", "h", "o", "i", "f", "j", "k", "l", "m", "n", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
