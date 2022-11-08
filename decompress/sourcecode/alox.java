import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alox extends agzi implements ahax
{
    public static final alox a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alox.class, a = new alox());
    }
    
    private alox() {
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
                if ((d = alox.d) == null) {
                    synchronized (alox.class) {
                        if (alox.d == null) {
                            alox.d = (ahbe)new agzb((agzi)alox.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alox.a;
            }
            case 4: {
                return new agza((agzi)alox.a);
            }
            case 3: {
                return new alox();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alox.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\uff59\u3f35\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\uff59\u3f35\u143c\u0000", new Object[] { "c", "b", aibb.class, aloa.class });
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
