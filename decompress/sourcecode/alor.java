import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alor extends agzi implements ahax
{
    public static final alor a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alor.class, a = new alor());
    }
    
    private alor() {
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
                if ((d = alor.d) == null) {
                    synchronized (alor.class) {
                        if (alor.d == null) {
                            alor.d = (ahbe)new agzb((agzi)alor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alor.a;
            }
            case 4: {
                return new agza((agzi)alor.a);
            }
            case 3: {
                return new alor();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alor.a, "\u0001\u0002\u0001\u0000\ufc43\u196f\uff36\u42bd\u0002\u0000\u0000\u0002\ufc43\u196f\u143c\u0000\uff36\u42bd\u143c\u0000", new Object[] { "c", "b", ajcz.class, alns.class });
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
