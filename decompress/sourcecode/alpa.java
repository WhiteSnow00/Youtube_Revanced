import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpa extends agzi implements ahax
{
    public static final alpa a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alpa.class, a = new alpa());
    }
    
    private alpa() {
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
                if ((d = alpa.d) == null) {
                    synchronized (alpa.class) {
                        if (alpa.d == null) {
                            alpa.d = (ahbe)new agzb((agzi)alpa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpa.a;
            }
            case 4: {
                return new agza((agzi)alpa.a);
            }
            case 3: {
                return new alpa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpa.a, "\u0001\u0001\u0001\u0000\ue202\u39d6\ue202\u39d6\u0001\u0000\u0000\u0001\ue202\u39d6\u143c\u0000", new Object[] { "c", "b", alqk.class });
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
