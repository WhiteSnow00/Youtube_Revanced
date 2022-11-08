import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsb extends agzi implements ahax
{
    public static final amsb a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(amsb.class, a = new amsb());
    }
    
    private amsb() {
        this.f = 2;
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
                if ((b2 = amsb.b) == null) {
                    synchronized (amsb.class) {
                        if (amsb.b == null) {
                            amsb.b = (ahbe)new agzb((agzi)amsb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amsb.a;
            }
            case 4: {
                return new agza((agzi)amsb.a);
            }
            case 3: {
                return new amsb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsb.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0000\u0005\u1409\u0002", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
