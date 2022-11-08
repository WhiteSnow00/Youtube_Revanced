import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikk extends agzi implements ahax
{
    public static final aikk a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aikk.class, a = new aikk());
    }
    
    private aikk() {
        this.g = 2;
        this.c = agyc.b;
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
                final ahbe d;
                if ((d = aikk.d) == null) {
                    synchronized (aikk.class) {
                        if (aikk.d == null) {
                            aikk.d = (ahbe)new agzb((agzi)aikk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aikk.a;
            }
            case 4: {
                return new agza((agzi)aikk.a);
            }
            case 3: {
                return new aikk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002", new Object[] { "b", "e", "f", "c" });
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
