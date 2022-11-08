import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsz extends agzi implements ahax
{
    public static final ahsz a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private ajsq f;
    private anss g;
    private anss h;
    private ajsq i;
    private aioe j;
    private aioe k;
    private anss l;
    private anss m;
    private amer n;
    private aioe o;
    private ahfw p;
    private anss q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(ahsz.class, a = new ahsz());
    }
    
    private ahsz() {
        this.r = 2;
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
                if ((b2 = ahsz.b) == null) {
                    synchronized (ahsz.class) {
                        if (ahsz.b == null) {
                            ahsz.b = (ahbe)new agzb((agzi)ahsz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahsz.a;
            }
            case 4: {
                return new agza((agzi)ahsz.a);
            }
            case 3: {
                return new ahsz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsz.a, "\u0001\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0000\u000e\u0001\u1409\u0000\u0002\u1409\u0002\u0005\u1409\b\u0006\u1409\t\u0007\u1409\r\b\u1409\u0012\f\u1409\u0014\u000e\u1409\u0001\u000f\u1409\u0003\u0010\u1409\u0005\u0013\u1409\u000b\u0015\u1409\f\u0016\u1409\u000e\u0017\u1409\n", new Object[] { "c", "d", "f", "i", "j", "n", "p", "q", "e", "g", "h", "l", "m", "o", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
