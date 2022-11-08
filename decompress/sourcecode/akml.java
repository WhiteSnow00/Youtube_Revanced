import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akml extends agzi implements ahax
{
    public static final akml a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akml.class, a = new akml());
    }
    
    private akml() {
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
                if ((d = akml.d) == null) {
                    synchronized (akml.class) {
                        if (akml.d == null) {
                            akml.d = (ahbe)new agzb((agzi)akml.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akml.a;
            }
            case 4: {
                return new agza((agzi)akml.a);
            }
            case 3: {
                return new akml();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akml.a, "\u0001\u0004\u0001\u0000\uf486\u28b5\ue7fb\u51b0\u0004\u0000\u0000\u0004\uf486\u28b5\u143c\u0000\uf730\u3b2e\u143c\u0000\uf731\u3b2e\u143c\u0000\ue7fb\u51b0\u143c\u0000", new Object[] { "c", "b", ajpr.class, akmm.class, akmk.class, alli.class });
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
