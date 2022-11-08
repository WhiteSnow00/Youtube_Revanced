import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akya extends agzi implements ahax
{
    public static final akya a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)akya.class, (agzi)(a = new akya()));
    }
    
    private akya() {
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
                if ((d = akya.d) == null) {
                    synchronized (akya.class) {
                        if (akya.d == null) {
                            akya.d = (ahbe)new agzb((agzi)akya.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akya.a;
            }
            case 4: {
                return new agza((agzi)akya.a);
            }
            case 3: {
                return new akya();
            }
            case 2: {
                return newMessageInfo((MessageLite)akya.a, "\u0001\u0001\u0001\u0000\uf3fb\u30fa\uf3fb\u30fa\u0001\u0000\u0000\u0001\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", ajzl.class });
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
