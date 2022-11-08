import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuy extends agzi implements ahax
{
    public static final aiuy a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private anss f;
    private anss g;
    private anss h;
    private aioe i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private aioe m;
    private ajsq n;
    private ahfw o;
    private anss p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(aiuy.class, a = new aiuy());
    }
    
    private aiuy() {
        this.q = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = aiuy.b) == null) {
                    synchronized (aiuy.class) {
                        if (aiuy.b == null) {
                            aiuy.b = (ahbe)new agzb((agzi)aiuy.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiuy.a;
            }
            case 4: {
                return new agza((agzi)aiuy.a);
            }
            case 3: {
                return new aiuy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuy.a, "\u0001\r\u0000\u0001\b\u001a\r\u0000\u0000\r\b\u1409\u0007\t\u1409\b\n\u1409\u0001\r\u1409\t\u000e\u1409\u000f\u0011\u1409\u000b\u0013\u1409\u0003\u0014\u1409\u0004\u0015\u1409\f\u0016\u1409\u0005\u0017\u1409\n\u0018\u1409\r\u001a\u1409\u0006", new Object[] { "c", "i", "j", "d", "k", "p", "m", "e", "f", "n", "g", "l", "o", "h" });
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
