import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiui extends agzi implements ahax
{
    public static final aiui a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private ajsq f;
    private anss g;
    private anss h;
    private aioe i;
    private amer j;
    private anss k;
    private aioe l;
    private anss m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(aiui.class, a = new aiui());
    }
    
    private aiui() {
        this.o = 2;
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
                if ((b2 = aiui.b) == null) {
                    synchronized (aiui.class) {
                        if (aiui.b == null) {
                            aiui.b = (ahbe)new agzb((agzi)aiui.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiui.a;
            }
            case 4: {
                return new agza((agzi)aiui.a);
            }
            case 3: {
                return new aiui();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiui.a, "\u0001\u000b\u0000\u0001\u0002\u0015\u000b\u0000\u0000\u000b\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0007\u0007\u1409\t\b\u1409\u0012\r\u1409\u000e\u000f\u1409\u0002\u0010\u1409\u0004\u0011\u1409\u0006\u0014\u1409\u000b\u0015\u1409\r", new Object[] { "c", "d", "f", "i", "j", "n", "m", "e", "g", "h", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
