import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfz extends ahcz implements aheo
{
    public static final alfz a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alfz.class, a = new alfz());
    }
    
    private alfz() {
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
                if ((d = alfz.d) == null) {
                    synchronized (alfz.class) {
                        if (alfz.d == null) {
                            alfz.d = (ahev)new ahcs((ahcz)alfz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfz.a;
            }
            case 4: {
                return new ahcr((ahcz)alfz.a);
            }
            case 3: {
                return new alfz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfz.a, "\u0001\u0001\u0001\u0000\uf61a\u163f\uf61a\u163f\u0001\u0000\u0000\u0001\uf61a\u163f\u143c\u0000", new Object[] { "c", "b", ahzf.class });
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
