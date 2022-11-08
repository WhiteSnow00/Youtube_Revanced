import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andx extends agzi implements ahax
{
    public static final andx a;
    private static volatile ahbe e;
    public int b;
    public aibb c;
    public andv d;
    private andw f;
    private allx g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(andx.class, a = new andx());
    }
    
    private andx() {
        this.h = 2;
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
                final ahbe e;
                if ((e = andx.e) == null) {
                    synchronized (andx.class) {
                        if (andx.e == null) {
                            andx.e = (ahbe)new agzb((agzi)andx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return andx.a;
            }
            case 4: {
                return new agza((agzi)andx.a);
            }
            case 3: {
                return new andx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)andx.a, "\u0001\u0004\u0000\u0001\uea9e\u1ca7\uf830\u3ded\u0004\u0000\u0000\u0004\uea9e\u1ca7\u1409\u0002\ueb11\u1f11\u1409\u0001\ue917\u25ba\u1409\u0000\uf830\u3ded\u1409\u0003", new Object[] { "b", "g", "c", "f", "d" });
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
