import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibc extends agzi implements ahax
{
    public static final aibc a;
    private static volatile ahbe e;
    public int b;
    public aibb c;
    public aibk d;
    private allx f;
    private aibd g;
    private aibg h;
    private anwy i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aibc.class, (agzi)(a = new aibc()));
    }
    
    private aibc() {
        this.j = 2;
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
                final ahbe e;
                if ((e = aibc.e) == null) {
                    synchronized (aibc.class) {
                        if (aibc.e == null) {
                            aibc.e = (ahbe)new agzb((agzi)aibc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aibc.a;
            }
            case 4: {
                return new agza((agzi)aibc.a);
            }
            case 3: {
                return new aibc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibc.a, "\u0001\u0006\u0000\u0001\uea9e\u1ca7\ue3e9\ud798\u0006\u0000\u0000\u0006\uea9e\u1ca7\u1409\u0002\ueb11\u1f11\u1409\u0000\ue5d8\u2622\u1409\u0001\ue110\ua215\u1409\u0004\uf2c2\ua4a8\u1409\u0005\ue3e9\ud798\u1409\u0006", new Object[] { "b", "f", "c", "d", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
