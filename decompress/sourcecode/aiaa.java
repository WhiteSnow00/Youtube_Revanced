import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaa extends agzi implements ahax
{
    public static final aiaa a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aiaa.class, a = new aiaa());
    }
    
    private aiaa() {
        this.g = 2;
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
                if ((b2 = aiaa.b) == null) {
                    synchronized (aiaa.class) {
                        if (aiaa.b == null) {
                            aiaa.b = (ahbe)new agzb((agzi)aiaa.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiaa.a;
            }
            case 4: {
                return new agza((agzi)aiaa.a);
            }
            case 3: {
                return new aiaa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiaa.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
