import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaf extends agzi implements ahax
{
    public static final aiaf a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private anss f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aiaf.class, a = new aiaf());
    }
    
    private aiaf() {
        this.h = 2;
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
                if ((b2 = aiaf.b) == null) {
                    synchronized (aiaf.class) {
                        if (aiaf.b == null) {
                            aiaf.b = (ahbe)new agzb((agzi)aiaf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiaf.a;
            }
            case 4: {
                return new agza((agzi)aiaf.a);
            }
            case 3: {
                return new aiaf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiaf.a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0007\u1409\u0007\t\u1409\u0005", new Object[] { "c", "d", "e", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
