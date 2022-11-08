import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcm extends agzi implements ahax
{
    public static final apcm a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    private ajsq e;
    private aioe f;
    private aioe g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(apcm.class, a = new apcm());
    }
    
    private apcm() {
        this.i = 2;
        this.c = agyc.b;
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
                final ahbe d;
                if ((d = apcm.d) == null) {
                    synchronized (apcm.class) {
                        if (apcm.d == null) {
                            apcm.d = (ahbe)new agzb((agzi)apcm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apcm.a;
            }
            case 4: {
                return new agza((agzi)apcm.a);
            }
            case 3: {
                return new apcm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcm.a, "\u0001\u0005\u0000\u0001\u0003\f\u0005\u0000\u0000\u0004\u0003\u1409\u0001\u0007\u1409\u0005\b\u1409\u0006\u000b\u1409\t\f\u100a\n", new Object[] { "b", "e", "f", "g", "h", "c" });
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
