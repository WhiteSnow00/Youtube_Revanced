import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoy extends agzi implements ahax
{
    public static final apoy a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apoy.class, (agzi)(a = new apoy()));
    }
    
    private apoy() {
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
                if ((d = apoy.d) == null) {
                    synchronized (apoy.class) {
                        if (apoy.d == null) {
                            apoy.d = (ahbe)new agzb((agzi)apoy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoy.a;
            }
            case 4: {
                return new agza((agzi)apoy.a);
            }
            case 3: {
                return new apoy();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoy.a, "\u0001\u0003\u0001\u0000\uf03a\u2b94\ue496\u3d35\u0003\u0000\u0000\u0003\uf03a\u2b94\u143c\u0000\ufb65\u31c3\u143c\u0000\ue496\u3d35\u143c\u0000", new Object[] { "c", "b", ahyu.class, ahys.class, amfl.class });
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
