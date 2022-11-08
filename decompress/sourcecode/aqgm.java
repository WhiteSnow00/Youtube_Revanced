import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgm extends agzi implements ahax
{
    public static final aqgm a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private aqfp f;
    private aqgl g;
    private aioe h;
    private anss i;
    private aqfp j;
    private aqfp k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aqgm.class, (agzi)(a = new aqgm()));
    }
    
    private aqgm() {
        this.l = 2;
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
                if ((b2 = aqgm.b) == null) {
                    synchronized (aqgm.class) {
                        if (aqgm.b == null) {
                            aqgm.b = (ahbe)new agzb((agzi)aqgm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgm.a;
            }
            case 4: {
                return new agza((agzi)aqgm.a);
            }
            case 3: {
                return new aqgm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgm.a, "\u0001\b\u0000\u0001\b\u0013\b\u0000\u0000\b\b\u1409\u0005\t\u1409\u0002\n\u1409\u0006\u000b\u1409\u0007\u000f\u1409\u000b\u0010\u1409\f\u0012\u1409\u000e\u0013\u1409\u000f", new Object[] { "c", "e", "d", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
