import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahya extends agzi implements ahax
{
    public static final ahya a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahya.class, a = new ahya());
    }
    
    private ahya() {
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
                if ((d = ahya.d) == null) {
                    synchronized (ahya.class) {
                        if (ahya.d == null) {
                            ahya.d = (ahbe)new agzb((agzi)ahya.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahya.a;
            }
            case 4: {
                return new agza((agzi)ahya.a);
            }
            case 3: {
                return new ahya();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahya.a, "\u0001\n\u0001\u0000\ue1d6\u181e\ue882\ue0ff\u0007\n\u0000\u0000\n\ue1d6\u181e\u143c\u0000\uf143\u1824\u143c\u0000\ufcf4\u1830\u143c\u0000\ue567\u1832\u143c\u0000\uf696\u2f64\u143c\u0000\uead9\u3993\u143c\u0000\uf492\u4933\u143c\u0000\ufb1a\u5df0\u143c\u0000\uf52c\ua294\u143c\u0000\ue882\ue0ff\u0007\u143c\u0000", new Object[] { "c", "b", apmc.class, aiuh.class, anhf.class, aitp.class, aniz.class, ahxb.class, ajkj.class, ankh.class, ankc.class, anpd.class });
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
