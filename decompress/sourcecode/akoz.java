import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoz extends agzi implements ahax
{
    public static final akoz a;
    private static volatile ahbe d;
    public int b;
    public anws c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akoz.class, a = new akoz());
    }
    
    private akoz() {
        this.e = 2;
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
                if ((d = akoz.d) == null) {
                    synchronized (akoz.class) {
                        if (akoz.d == null) {
                            akoz.d = (ahbe)new agzb((agzi)akoz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akoz.a;
            }
            case 4: {
                return new agza((agzi)akoz.a);
            }
            case 3: {
                return new akoz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoz.a, "\u0001\u0001\u0000\u0001\ue7f5\u178e\ue7f5\u178e\u0001\u0000\u0000\u0001\ue7f5\u178e\u1409\u0000", new Object[] { "b", "c" });
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
