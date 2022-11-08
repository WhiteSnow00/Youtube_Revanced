import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdc extends agzi implements ahax
{
    public static final ajdc a;
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
    private aioe m;
    private ahfw n;
    private ahkq o;
    private ajsq p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(ajdc.class, a = new ajdc());
    }
    
    private ajdc() {
        this.q = 2;
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
                if ((b2 = ajdc.b) == null) {
                    synchronized (ajdc.class) {
                        if (ajdc.b == null) {
                            ajdc.b = (ahbe)new agzb((agzi)ajdc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajdc.a;
            }
            case 4: {
                return new agza((agzi)ajdc.a);
            }
            case 3: {
                return new ajdc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdc.a, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\r\u0001\u1409\f\u0004\u1409\u0001\u0006\u1409\u0003\u0007\u1409\u0004\b\u1409\u0006\t\u1409\u0007\n\u1409\b\f\u1409\u000b\r\u1409\u000e\u000e\u1409\t\u000f\u1409\n\u0010\u1409\u0005\u0011\u1409\u000f", new Object[] { "c", "n", "d", "e", "f", "h", "i", "j", "m", "o", "k", "l", "g", "p" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
