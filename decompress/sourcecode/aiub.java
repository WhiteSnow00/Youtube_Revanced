import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiub extends agzi implements ahax
{
    public static final aiub a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    public aorm g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aiub.class, a = new aiub());
    }
    
    private aiub() {
        this.k = 2;
        emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = aiub.i) == null) {
                    synchronized (aiub.class) {
                        if (aiub.i == null) {
                            aiub.i = (ahbe)new agzb((agzi)aiub.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiub.a;
            }
            case 4: {
                return new agza((agzi)aiub.a);
            }
            case 3: {
                return new aiub();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiub.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0005\b\u100a\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "j", "h" });
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
