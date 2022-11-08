import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmp extends agzi implements ahax
{
    public static final ahmp a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahmp.class, (agzi)(a = new ahmp()));
    }
    
    private ahmp() {
        this.b = 0;
        this.e = 2;
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
                if ((d = ahmp.d) == null) {
                    synchronized (ahmp.class) {
                        if (ahmp.d == null) {
                            ahmp.d = (ahbe)new agzb((agzi)ahmp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmp.a;
            }
            case 4: {
                return new agza((agzi)ahmp.a);
            }
            case 3: {
                return new ahmp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmp.a, "\u0001\u0003\u0001\u0000\ued6a\u25bb\uf829\u49b5\u0003\u0000\u0000\u0003\ued6a\u25bb\u143c\u0000\ueb3f\u327c\u143c\u0000\uf829\u49b5\u143c\u0000", new Object[] { "c", "b", aisy.class, ahmn.class, ahmm.class });
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
