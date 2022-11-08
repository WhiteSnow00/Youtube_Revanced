import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibs extends agzi implements ahax
{
    public static final aibs a;
    private static volatile ahbe d;
    public int b;
    public aifq c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibs.class, (agzi)(a = new aibs()));
    }
    
    private aibs() {
        this.e = 2;
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
                final ahbe d;
                if ((d = aibs.d) == null) {
                    synchronized (aibs.class) {
                        if (aibs.d == null) {
                            aibs.d = (ahbe)new agzb((agzi)aibs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibs.a;
            }
            case 4: {
                return new agza((agzi)aibs.a);
            }
            case 3: {
                return new aibs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibs.a, "\u0001\u0001\u0000\u0001\uf601\u18c7\uf601\u18c7\u0001\u0000\u0000\u0001\uf601\u18c7\u1409\u0000", new Object[] { "b", "c" });
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
