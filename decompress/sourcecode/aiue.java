import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiue extends agzi implements ahax
{
    public static final aiue a;
    private static volatile ahbe i;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public anss f;
    public aioe g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aiue.class, a = new aiue());
    }
    
    private aiue() {
        this.k = 2;
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
                if ((i = aiue.i) == null) {
                    synchronized (aiue.class) {
                        if (aiue.i == null) {
                            aiue.i = (ahbe)new agzb((agzi)aiue.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiue.a;
            }
            case 4: {
                return new agza((agzi)aiue.a);
            }
            case 3: {
                return new aiue();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiue.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "j", "h", "g" });
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
