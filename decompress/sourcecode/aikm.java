import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikm extends agzi implements ahax
{
    public static final aikm a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    private aioe e;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aikm.class, a = new aikm());
    }
    
    private aikm() {
        this.h = 2;
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
                if ((d = aikm.d) == null) {
                    synchronized (aikm.class) {
                        if (aikm.d == null) {
                            aikm.d = (ahbe)new agzb((agzi)aikm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aikm.a;
            }
            case 4: {
                return new agza((agzi)aikm.a);
            }
            case 3: {
                return new aikm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikm.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "b", "e", "f", "g", "c" });
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