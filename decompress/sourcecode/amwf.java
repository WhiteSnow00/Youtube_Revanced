import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwf extends agzi implements ahax
{
    public static final amwf a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public long d;
    public aioe e;
    public akbf f;
    public boolean g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(amwf.class, a = new amwf());
    }
    
    private amwf() {
        this.k = 2;
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = amwf.i) == null) {
                    synchronized (amwf.class) {
                        if (amwf.i == null) {
                            amwf.i = (ahbe)new agzb((agzi)amwf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amwf.a;
            }
            case 4: {
                return new agza((agzi)amwf.a);
            }
            case 3: {
                return new amwf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwf.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1002\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1007\u0004\u0006\u1409\u0005\u0007\u100a\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
