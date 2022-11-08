import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlo extends agzi implements ahax
{
    public static final anlo a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private anss h;
    private anss i;
    private anss j;
    private anss k;
    private anss l;
    private anss m;
    private anss n;
    private ahfw o;
    private anss p;
    private anss q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(anlo.class, a = new anlo());
    }
    
    private anlo() {
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
                if ((b2 = anlo.b) == null) {
                    synchronized (anlo.class) {
                        if (anlo.b == null) {
                            anlo.b = (ahbe)new agzb((agzi)anlo.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anlo.a;
            }
            case 4: {
                return new agza((agzi)anlo.a);
            }
            case 3: {
                return new anlo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlo.a, "\u0001\u000e\u0000\u0001\u0001\"\u000e\u0000\u0000\u000e\u0001\u1409\u0000\u0003\u1409\n\u000b\u1409\t\u000e\u1409\u0011\u000f\u1409\f\u0015\u1409\u0002\u0016\u1409\u0005\u0017\u1409\u0006\u001a\u1409\r\u001b\u1409\u0012\u001c\u1409\u0013 \u1409\u000e!\u1409\u000b\"\u1409\u000f", new Object[] { "c", "d", "i", "h", "o", "k", "e", "f", "g", "l", "p", "q", "m", "j", "n" });
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
