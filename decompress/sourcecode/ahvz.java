import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvz extends agzi implements ahax
{
    public static final ahvz a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahvz.class, a = new ahvz());
    }
    
    private ahvz() {
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
                if ((d = ahvz.d) == null) {
                    synchronized (ahvz.class) {
                        if (ahvz.d == null) {
                            ahvz.d = (ahbe)new agzb((agzi)ahvz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahvz.a;
            }
            case 4: {
                return new agza((agzi)ahvz.a);
            }
            case 3: {
                return new ahvz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvz.a, "\u0001\u0002\u0001\u0000\ue607\u2a05\ue60b\u56e4\u0002\u0000\u0000\u0002\ue607\u2a05\u143c\u0000\ue60b\u56e4\u143c\u0000", new Object[] { "c", "b", apgl.class, aioh.class });
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
