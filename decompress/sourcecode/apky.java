import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apky extends agzi implements ahax
{
    public static final apky a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private anss e;
    private anss f;
    private anss g;
    private anss h;
    private aioe i;
    private ahkq j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(apky.class, a = new apky());
    }
    
    private apky() {
        this.k = 2;
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = apky.b) == null) {
                    synchronized (apky.class) {
                        if (apky.b == null) {
                            apky.b = (ahbe)new agzb((agzi)apky.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apky.a;
            }
            case 4: {
                return new agza((agzi)apky.a);
            }
            case 3: {
                return new apky();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apky.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0003\b\u1409\u0006\t\u1409\u0007\n\u1409\u0005", new Object[] { "c", "d", "e", "g", "f", "i", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
