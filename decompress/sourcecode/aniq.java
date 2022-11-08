import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniq extends agzi implements ahax
{
    public static final aniq a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aniq.class, a = new aniq());
    }
    
    private aniq() {
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
                if ((d = aniq.d) == null) {
                    synchronized (aniq.class) {
                        if (aniq.d == null) {
                            aniq.d = (ahbe)new agzb((agzi)aniq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aniq.a;
            }
            case 4: {
                return new agza((agzi)aniq.a);
            }
            case 3: {
                return new aniq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aniq.a, "\u0001\u0001\u0001\u0000\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aibb.class });
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
