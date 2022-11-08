import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmv extends agzi implements ahax
{
    public static final ahmv a;
    private static volatile ahbe d;
    public int b;
    public amet c;
    private aibb e;
    private ahmu f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmv.class, (agzi)(a = new ahmv()));
    }
    
    private ahmv() {
        this.g = 2;
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
                if ((d = ahmv.d) == null) {
                    synchronized (ahmv.class) {
                        if (ahmv.d == null) {
                            ahmv.d = (ahbe)new agzb((agzi)ahmv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmv.a;
            }
            case 4: {
                return new agza((agzi)ahmv.a);
            }
            case 3: {
                return new ahmv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmv.a, "\u0001\u0003\u0000\u0001\ueb11\u1f11\uf543\u3b5a\u0003\u0000\u0000\u0003\ueb11\u1f11\u1409\u0000\ue97d\u2739\u1409\u0002\uf543\u3b5a\u1409\u0001", new Object[] { "b", "e", "c", "f" });
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
