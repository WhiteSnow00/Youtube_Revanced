import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvz extends ahcz implements aheo
{
    public static final alvz a;
    private static volatile ahev g;
    public int b;
    public Object c;
    public int d;
    public boolean e;
    public int f;
    private int h;
    private aisc i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alvz.class, a = new alvz());
    }
    
    private alvz() {
        this.b = 0;
        this.j = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = alvz.g) == null) {
                    synchronized (alvz.class) {
                        if (alvz.g == null) {
                            alvz.g = (ahev)new ahcs((ahcz)alvz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alvz.a;
            }
            case 4: {
                return new ahcr((ahcz)alvz.a);
            }
            case 3: {
                return new alvz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvz.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u100b\u0002\u0004\u1409\u0003\u0005\u143c\u0000\u0006\u143c\u0000", new Object[] { "c", "b", "h", "d", alwa.a, "e", "f", "i", ajws.class, anxb.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
