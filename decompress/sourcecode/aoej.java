import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoej extends agzi implements ahax
{
    public static final aoej a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aoej.class, a = new aoej());
    }
    
    private aoej() {
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
                if ((d = aoej.d) == null) {
                    synchronized (aoej.class) {
                        if (aoej.d == null) {
                            aoej.d = (ahbe)new agzb((agzi)aoej.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoej.a;
            }
            case 4: {
                return new agza((agzi)aoej.a);
            }
            case 3: {
                return new aoej();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoej.a, "\u0001\u0001\u0001\u0000\uf26a\u2912\uf26a\u2912\u0001\u0000\u0000\u0001\uf26a\u2912\u143c\u0000", new Object[] { "c", "b", alhe.class });
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
