import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apem extends agzi implements ahax
{
    public static final apem a;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public akbf d;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apem.class, a = new apem());
    }
    
    private apem() {
        this.h = 2;
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
                final ahbe e;
                if ((e = apem.e) == null) {
                    synchronized (apem.class) {
                        if (apem.e == null) {
                            apem.e = (ahbe)new agzb((agzi)apem.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apem.a;
            }
            case 4: {
                return new agza((agzi)apem.a);
            }
            case 3: {
                return new apem();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apem.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "f", "c", "g", "d" });
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
