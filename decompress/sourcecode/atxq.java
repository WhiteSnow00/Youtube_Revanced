import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxq extends agzi implements ahax
{
    public static final atxq a;
    private static volatile ahbe b;
    private int c;
    private afpf d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(atxq.class, a = new atxq());
    }
    
    private atxq() {
        this.e = 2;
        emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((b2 = atxq.b) == null) {
                    synchronized (atxq.class) {
                        if (atxq.b == null) {
                            atxq.b = (ahbe)new agzb((agzi)atxq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return atxq.a;
            }
            case 4: {
                return new agza((agzi)atxq.a);
            }
            case 3: {
                return new atxq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxq.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
