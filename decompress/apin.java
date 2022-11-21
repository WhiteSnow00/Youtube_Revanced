import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apin extends ahcz implements aheo
{
    public static final apin a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apin.class, a = new apin());
    }
    
    private apin() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apin.d) == null) {
                    synchronized (apin.class) {
                        if (apin.d == null) {
                            apin.d = (ahev)new ahcs((ahcz)apin.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apin.a;
            }
            case 4: {
                return new ahcr((ahcz)apin.a);
            }
            case 3: {
                return new apin();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apin.a, "\u0001\u0002\u0001\u0000\uec06\u17ef\uf74f\u2a6b\u0002\u0000\u0000\u0002\uec06\u17ef\u143c\u0000\uf74f\u2a6b\u143c\u0000", new Object[] { "c", "b", alme.class, akeg.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
