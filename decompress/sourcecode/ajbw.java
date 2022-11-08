import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbw extends agzi implements ahax
{
    public static final ajbw a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private anss f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private aiib j;
    private anss k;
    private anss l;
    private anss m;
    private anss n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(ajbw.class, a = new ajbw());
    }
    
    private ajbw() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                if ((b2 = ajbw.b) == null) {
                    synchronized (ajbw.class) {
                        if (ajbw.b == null) {
                            ajbw.b = (ahbe)new agzb((agzi)ajbw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajbw.a;
            }
            case 4: {
                return new agza((agzi)ajbw.a);
            }
            case 3: {
                return new ajbw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbw.a, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\r\u1409\n\u000e\u1409\u000b\u000f\u1409\u0005\u0010\u1409\f\u0012\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "h", "n", "o" });
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
