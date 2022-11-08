import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albw extends agzi implements ahax
{
    public static final albw a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)albw.class, (agzi)(a = new albw()));
    }
    
    private albw() {
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
                if ((d = albw.d) == null) {
                    synchronized (albw.class) {
                        if (albw.d == null) {
                            albw.d = (ahbe)new agzb((agzi)albw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albw.a;
            }
            case 4: {
                return new agza((agzi)albw.a);
            }
            case 3: {
                return new albw();
            }
            case 2: {
                return newMessageInfo((MessageLite)albw.a, "\u0001\u0001\u0001\u0000\uf61a\u163f\uf61a\u163f\u0001\u0000\u0000\u0001\uf61a\u163f\u143c\u0000", new Object[] { "c", "b", ahvo.class });
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
