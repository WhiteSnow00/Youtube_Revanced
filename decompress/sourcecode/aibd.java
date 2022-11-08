import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibd extends agzi implements ahax
{
    public static final aibd a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aibd.class, (agzi)(a = new aibd()));
    }
    
    private aibd() {
        this.f = 2;
        final agyc b = agyc.b;
    }
    
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
                if ((b2 = aibd.b) == null) {
                    synchronized (aibd.class) {
                        if (aibd.b == null) {
                            aibd.b = (ahbe)new agzb((agzi)aibd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aibd.a;
            }
            case 4: {
                return new agza((agzi)aibd.a);
            }
            case 3: {
                return new aibd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibd.a, "\u0001\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0002\u0002\u1409\u0004\b\u1409\u0002", new Object[] { "c", "e", "d" });
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
