import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akng extends agzi implements ahax
{
    public static final akng a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akng.class, a = new akng());
    }
    
    private akng() {
        this.b = 0;
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
                if ((d = akng.d) == null) {
                    synchronized (akng.class) {
                        if (akng.d == null) {
                            akng.d = (ahbe)new agzb((agzi)akng.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akng.a;
            }
            case 4: {
                return new agza((agzi)akng.a);
            }
            case 3: {
                return new akng();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akng.a, "\u0001\u0001\u0001\u0000\ue315\u1baf\ue315\u1baf\u0001\u0000\u0000\u0001\ue315\u1baf\u143c\u0000", new Object[] { "c", "b", ahpe.class });
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
