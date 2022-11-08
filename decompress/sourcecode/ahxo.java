import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxo extends agzi implements ahax
{
    public static final ahxo a;
    private static volatile ahbe d;
    public int b;
    public aibb c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahxo.class, a = new ahxo());
    }
    
    private ahxo() {
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
                if ((d = ahxo.d) == null) {
                    synchronized (ahxo.class) {
                        if (ahxo.d == null) {
                            ahxo.d = (ahbe)new agzb((agzi)ahxo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahxo.a;
            }
            case 4: {
                return new agza((agzi)ahxo.a);
            }
            case 3: {
                return new ahxo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxo.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
