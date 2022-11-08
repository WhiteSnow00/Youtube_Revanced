import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitr extends agzi implements ahax
{
    public static final aitr a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aitr.class, a = new aitr());
    }
    
    private aitr() {
        this.g = 2;
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
                if ((b2 = aitr.b) == null) {
                    synchronized (aitr.class) {
                        if (aitr.b == null) {
                            aitr.b = (ahbe)new agzb((agzi)aitr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aitr.a;
            }
            case 4: {
                return new agza((agzi)aitr.a);
            }
            case 3: {
                return new aitr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitr.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
