import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmm extends agzi implements ahax
{
    public static final ahmm a;
    private static volatile ahbe c;
    public agyc b;
    private int d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmm.class, (agzi)(a = new ahmm()));
    }
    
    private ahmm() {
        this.g = 2;
        this.b = agyc.b;
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
                final ahbe c;
                if ((c = ahmm.c) == null) {
                    synchronized (ahmm.class) {
                        if (ahmm.c == null) {
                            ahmm.c = (ahbe)new agzb((agzi)ahmm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmm.a;
            }
            case 4: {
                return new agza((agzi)ahmm.a);
            }
            case 3: {
                return new ahmm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmm.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0002\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "d", "e", "f", "b" });
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
